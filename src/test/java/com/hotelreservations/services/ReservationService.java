package com.hotelreservations.services;

import com.hotelreservations.models.Auth;
import com.hotelreservations.models.Booking;
import com.hotelreservations.models.BookingDates;
import com.hotelreservations.models.BookingResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ReservationService extends BaseTest {
    // token olustur

    Auth authBody = new Auth("admin","password123");
    public String generateToken() {
        Response response = given(spec)
                .contentType(ContentType.JSON)
                .when()
                .body(authBody)
                .post("/auth");

        response
                .then()
                .statusCode(200);

        return response.jsonPath().getJsonObject("token");

    }

    // rezervasyon olustur
    public BookingResponse createBooking() {
        BookingDates bookingDates = new BookingDates("2023-04-01", "2023-04-04");
        Booking booking = new Booking("Fatih", "Arslan", 1000, true, bookingDates, "sigara odasi");

        Response response = given(spec)
                .contentType(ContentType.JSON)
                .when()
                .body(booking)
                .post("/booking");

        response
                .then()
                .statusCode(200);

        return response.as(BookingResponse.class);
    }


    // rezervasyon silme
    public void deleteBooking  (String token, int bookingId) {
         Response response = given(spec)
                 .contentType(ContentType.JSON)
                 .header("Cookie","token="+token)
                 .delete("/booking/"+ bookingId);

         response
                 .then()
                 .statusCode(201);
    }




}
