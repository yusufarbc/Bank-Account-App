# Banka-Hesap-Uygulamasi
<h1>Nesne Yönelimli Programlama Dersi<br>PROJE RAPORU</h1>

<h2>Süreç</h2>
•	Projeme ilk olarak UML diyagramımdaki sınıfları oluşturarak başladım. Sınıfları oluşturdum gerekli değişken ve metot tanımlamalarını yaptım ve miras ilişkilerini kurdum.<br>
•	Ardından kullanıcı arayüzü tasarımına geçtim. Bunun için netbeansin sahip olduğu Jframe eklentisini kullandım. 5 tane Jframe dosyası oluşturdum bunlar MainWindow, CustomerInfoWindow, CreditInfoWindow, AccountInfoWindow ve CustomerAddWindow’dur. 
<br>
•	Netbeansin sağladığı eklenti ile arayüz tasarımını yapmam çok kolay oldu. Bana sadece arayüz ile diğer sınıfları bağlamak kaldı. Pdf’de yazan şekilde metotların içlerini doldurdum .
<br>
•	Ardından kullanıcı arayüzünde yapılacak işlemler için Jframeler üzerinde çalışmaya başladım. Jframe dosyaları üzerinde istediğim gibi oynama yapamıyorum netbeans buna izin vermiyor. Sadece bazı kısımlarda değişiklik yapabiliyorum. Bu da benim yazdığım sınıfları entegre etmem için yeterliydi. 
<br>
•	Constructorları ve ActionPerformed metotlarını kendim yazdım. ActionPerformed metotlarında butona basılınca yapılacak işlemleri tanımladım. Constructorlarda ise arayüzlerde olan tabloları düzenledim. Elemanları dinamik olarak constructorlarda ekledim.
<br>
•	Hesap silme ve kredi kartı silme işlemlerinde nedenini bilmediğim bir hata mesajı yazıyor ancak silme işlemini başarılı bir şekilde gerçekleştiriyor, fırlattığı exception programın yürütülmesini durdurmuyor.
<br>
•	Hesap ekle metodu hesaplara default olarak 1000 lira bakiye ekliyor. Bunu para transfer işlemlerini yapabilmek için ekledim.
<br>
•	Arayüzdeki bütün butonlar ve fieldlar da çalışıyor.
<br>
<h2>Arayüz</h2>
Program Main sınıfından çalıştırıldığında, MainWindow açılıyor. 

![image](https://user-images.githubusercontent.com/77548038/155879004-5e1613e4-952e-42a7-b1f9-5192ade0593e.png)

Bu pencerenin kapanması halinde program sonlanyor ancak butonlara basılarak açılan diğer pencereleri kapatınca sadece pencere kapanıyor program çalışmaya devam ediyor.
Programı kullanmak için ilk olarak bir müşteri eklemelisiniz. Müşteri ekle butonuna basarak müşteri ekleme penceresini açabilir, buradaki fieldları doldurarak müşteri yaratabilirsiniz. Ekle butonuna bastığınızda, “kişi eklendi” yazan bir diyalog penceresi açılır. Fieldın boş bırakılması durumunda null değer verilir. 

![image](https://user-images.githubusercontent.com/77548038/155879017-a08c63f9-aa8c-4577-860f-5c78af90d827.png)


Müşteriyi ekledikten sonra müşteri bilgileri butonuna basıp pencereyi açarsanız buradaki tabloda eklediğiniz müşteriyi görebilirsiniz. Ancak müşteri ekledikten sonra müşterinin tabloda görünmesi için penceriyi yeniden açmanız gerekir. Çünkü, tabloya elemanları ekleme işlemi constructorda yapılıyor. Constructorı yeniden çağırmak için pencereyi yeniden açmak lazım.

![image](https://user-images.githubusercontent.com/77548038/155879025-685f7699-c497-4f39-9c09-b4304f32105a.png)

Burada müşteri numarasını girerek hesap ekleme ve kredi kartı ekleme işlemlerini yapabilirsiniz. Eklediğiniz hesabın ıbanı ve eklediğiniz kredi kartının kart numarası alttaki fielda yazılacaktır. Hesap ekleme yaparken vadesiz hesap ve yatırım hesabının olduğu check boxlardan en az birini seçmelisiniz. İkisinide seçerseniz sırayla iki hesap oluşturur. Hiçbirini seçmezseniz hesap oluştumaz. Hesap silmek için hem müşteri numarasını hemde ıbanı fielda girmelisiniz, aynı şekilde kredi kartı silmek içinde hem müşteri numarasını hemde kart numarasını ilgili fielda girmelisiniz. Ekle ve Sil işlemlerinde işlemin gerçekleştiğine dair dialog kutuları çıkacaktır. 
Eklediğiniz hesapları görmek için Hesap Bilgileri butonuna basıp pencereyi açabilirsiniz.

![image](https://user-images.githubusercontent.com/77548038/155879050-730eaab4-125e-4dca-a881-7ee258402cd8.png)

Bu pencerede para transferi ve kredi katı borç ödeme işlemlerini yapabilirsiniz. Bu işlemleri yaptığınızda yukarıdaki tablo otomatik olarak güncellenecektir, pencereyi yeniden açmanıza gerek kalmayacaktır. 
Son olarakda, kredi bilgileri butonuna bastığınızda açılan pencere de oluşturduğunuz kredi kartlarını görebilirsiniz.  Yeni kart oluşturduğunuzda pencereyi yeniden açmanız gerekir.
 ![image](https://user-images.githubusercontent.com/77548038/155879065-ac860ed0-5113-48a2-8576-9e7e624ec0bf.png)


<h2>Sonuç</h2>
	Sonuç olarak, temel bir bankacılık uygulaması üzerinde çalıştım. Java diliyle kod yazma kabiliyetim gelişti. Toplam 13 classdan oluşan bir proje yazmış oldum. 
	Ödev sırasında birçok hata aldım, çözmek için saatlerce uğraştım. StackOweflow‘ın bu konuda çok yardımı oldu. Benim açımdan gayet verimliydi. 
