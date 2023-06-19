### API Test Projesi

Bu proje, Restful Booker sitesi üzerinde otel rezervasyonu oluşturma ve rezervasyonu iptal etme işlemlerini test etmek için RestAssured ve Cucumber kullanılarak Java dilinde IntelliJ IDEA üzerinde geliştirilmiştir.

### Proje İçeriği

Proje aşağıdaki senaryoyu gerçekleştirmek için tasarlanmıştır:
Senaryo: Kullanıcı olarak otel rezervasyonu oluşturabilirim

    Verilen bir kullanıcı yeni bir rezervasyon oluşturur.
    Kullanıcı, rezervasyon için gerekli bilgileri girer.
    Kullanıcı otel rezervasyonunu oluşturur.
    Rezervasyonun başarıyla oluşturulduğu doğrulanır.
    Kullanıcı oluşturulan rezervasyonu iptal eder.

Kurulum

    Bu proje Java 8 ve üzeri bir Java Development Kit (JDK) gerektirir. İnternet bağlantısı gerekebilir.
    IntelliJ IDEA veya tercih ettiğiniz bir Java IDE'si indirin ve yükleyin.
    Bu projeyi GitHub'dan indirin veya kaynak kodunu kopyalayın.

### Proje Yapısı

Proje aşağıdaki dosya ve klasörlerden oluşur:

    src: Kaynak kodun bulunduğu klasör.
        test: Test senaryolarının ve yardımcı sınıfların bulunduğu klasör.
            java: Java sınıflarının bulunduğu klasör.
                steps: Senaryo adımlarının uygulandığı Cucumber adım tanımları.
                runners: Cucumber senaryolarını çalıştırmak için kullanılan test koşucu sınıfları.
            resources: Test senaryolarının Cucumber özellik dosyalarının bulunduğu klasör.
    pom.xml: Maven proje yapılandırma dosyası.

### Nasıl Çalıştırılır

    IntelliJ IDEA'yi açın.
    Projeyi açmak için "Open" veya "Import" seçeneklerini kullanın ve projenin bulunduğu dizini seçin.
    Maven bağımlılıklarının otomatik olarak yüklenmesini bekleyin.
    Test senaryolarını çalıştırmak için src/test/java/runners klasöründeki Cucumber test koşucu sınıflarını bulun ve çalıştırın.
    Senaryoların geçerli olup olmadığını ve test sonuçlarını görüntüleyin.

### Notlar

    Senaryoları çalıştırmadan önce Restful Booker sitesine erişim sağlayabilmeniz için internet bağlantısının olduğundan emin olun.
    Restful Booker sitesine yönlendirme ve oturum açma adımları, senaryoların içerisinde yer almamaktadır. Bu adımların senaryolardan önce gerçekleştirildiğinden emin olun.

Bu README dosyası, API Test Projesi'nin kullanımını anlatmak için hazırlanmıştır. Projenin daha fazla ayrıntısına kaynak kodu ve belgelendirmesiyle ulaşabilirsiniz.

İyi testler!
