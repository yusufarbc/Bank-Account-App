# Banka-Hesap-Uygulamasi
Süreç
•	Projeme ilk olarak UML diyagramımdaki sınıfları oluşturarak başladım. Sınıfları oluşturdum gerekli değişken ve metot tanımlamalarını yaptım ve miras ilişkilerini kurdum.
•	Ardından kullanıcı arayüzü tasarımına geçtim. Bunun için netbeansin sahip olduğu Jframe eklentisini kullandım. 5 tane Jframe dosyası oluşturdum bunlar MainWindow, CustomerInfoWindow, CreditInfoWindow, AccountInfoWindow ve CustomerAddWindow’dur. 
•	Netbeansin sağladığı eklenti ile arayüz tasarımını yapmam çok kolay oldu. Bana sadece arayüz ile diğer sınıfları bağlamak kaldı. Pdf’de yazan şekilde metotların içlerini doldurdum .
•	Ardından kullanıcı arayüzünde yapılacak işlemler için Jframeler üzerinde çalışmaya başladım. Jframe dosyaları üzerinde istediğim gibi oynama yapamıyorum netbeans buna izin vermiyor. Sadece bazı kısımlarda değişiklik yapabiliyorum. Bu da benim yazdığım sınıfları entegre etmem için yeterliydi. 
•	Constructorları ve ActionPerformed metotlarını kendim yazdım. ActionPerformed metotlarında butona basılınca yapılacak işlemleri tanımladım. Constructorlarda ise arayüzlerde olan tabloları düzenledim. Elemanları dinamik olarak constructorlarda ekledim.
•	Hesap silme ve kredi kartı silme işlemlerinde nedenini bilmediğim bir hata mesajı yazıyor ancak silme işlemini başarılı bir şekilde gerçekleştiriyor, fırlattığı exception programın yürütülmesini durdurmuyor. 
•	Hesap ekle metodu hesaplara default olarak 1000 lira bakiye ekliyor. Bunu para transfer işlemlerini yapabilmek için ekledim
•	Arayüzdeki bütün butonlar çalışıyor, fieldlar da çalışıyor.





![image](https://user-images.githubusercontent.com/77548038/155878962-05e179f3-747b-4608-8e19-f044de789890.png)




Arayüz
Program Main sınıfından çalıştırıldığında, MainWindow açılıyor. 
Bu pencerenin kapanması halinde program sonlanyor ancak butonlara basılarak açılan diğer pencereleri kapatınca sadece pencere kapanıyor program çalışmaya devam ediyor.
Programı kullanmak için ilk olarak bir müşteri eklemelisiniz. Müşteri ekle butonuna basarak müşteri ekleme penceresini açabilir, buradaki fieldları doldurarak müşteri yaratabilirsiniz. Ekle butonuna bastığınızda, “kişi eklendi” yazan bir diyalog penceresi açılır. Fieldın boş bırakılması durumunda null değer verilir. 

Müşteriyi ekledikten sonra müşteri bilgileri butonuna basıp pencereyi açarsanız buradaki tabloda eklediğiniz müşteriyi görebilirsiniz. Ancak müşteri ekledikten sonra müşterinin tabloda görünmesi için penceriyi yeniden açmanız gerekir. Çünkü, tabloya elemanları ekleme işlemi constructorda yapılıyor. Constructorı yeniden çağırmak için pencereyi yeniden açmak lazım.
 ![image](https://user-images.githubusercontent.com/77548038/155878974-02784cf9-924d-4466-bfa1-6b52c2998182.png)

Burada müşteri numarasını girerek hesap ekleme ve kredi kartı ekleme işlemlerini yapabilirsiniz. Eklediğiniz hesabın ıbanı ve eklediğiniz kredi kartının kart numarası alttaki fielda yazılacaktır. Hesap ekleme yaparken vadesiz hesap ve yatırım hesabının olduğu check boxlardan en az birini seçmelisiniz. İkisinide seçerseniz sırayla iki hesap oluşturur. Hiçbirini seçmezseniz hesap oluştumaz. Hesap silmek için hem müşteri numarasını hemde ıbanı fielda girmelisiniz, aynı şekilde kredi kartı silmek içinde hem müşteri numarasını hemde kart numarasını ilgili fielda girmelisiniz. Ekle ve Sil işlemlerinde işlemin gerçekleştiğine dair dialog kutuları çıkacaktır. 



![image](https://user-images.githubusercontent.com/77548038/155878958-25749456-a693-42d1-8497-6acc603d3609.png)






Eklediğiniz hesapları görmek için Hesap Bilgileri butonuna basıp pencereyi açabilirsiniz.
 
Bu pencerede para transferi ve kredi katı borç ödeme işlemlerini yapabilirsiniz. Bu işlemleri yaptığınızda yukarıdaki tablo otomatik olarak güncellenecektir, pencereyi yeniden açmanıza gerek kalmayacaktır. 
Son olarakda, kredi bilgileri butonuna bastığınızda açılan pencere de oluşturduğunuz kredi kartlarını görebilirsiniz.  Yeni kart oluşturduğunuzda pencereyi yeniden açmanız gerekir.
 

Sonuç
	Sonuç olarak, temel bir bankacılık uygulaması üzerinde çalıştım. Java diliyle kod yazma kabiliyetim gelişti. Toplam 13 classdan oluşan bir proje yazmış oldum. 
	Ödev sırasında birçok hata aldım, çözmek için saatlerce uğraştım. StackOweflow‘ın bu konuda çok yardımı oldu. Benim açımdan gayet verimliydi. Güzel bir ödevdi. 
