## Local Test Env Setup
- /Koctas/src/test/java nin altindaki CukesRunner sayfasindan point edilmis testleri calistirabiliriz


## Test Execution
- /Koctas/src/test/java klasorune git
- CukesRunner classini ac
- Sag tikla
- Run As e tikla
- CucumberOption da point edilen test lerin hepsi calisacaktir

##  POM Design Pattern
- page object class larini Koctas.pages in altinda olusturabiliriz
- her bir sayfa/modul icin ayri bir page object olusturmak gerekir
- page object class larini page factory design pattern ile develop edersek @FindBy annotation i kullanarak kolayca WebElement lerimizi locate ederbiliriz
- Featurelarimizi /Koctas/src/test/resources package inin altinda olusturabiliriz
- step defination larimizi Koctas.step_defination package inin altina yazabiliriz
- page object veya test file larimizda kullanicagimiz yardimci methodlari Koctas.utilities package inin altinda olusturabilriz
- istenilen yeni library/ dependency leri pom.xml sayfasina eklemeyi unutmayiniz 

## Test Data
- test datalarimizi Koctas.test.data package inin altinda olusturunuz
- key and value cinsinden datalarinizi src/test/resources/test-data klasorunun altina .properties dosya turunden olusturabilirsiniz

## Yardimci Methodlar
- Koctas.utilities package nin altinda HelperMethods classinda yardimci methodlari olusturabiliriz
- ihtiyac duyuldugu takdirde WebDriver objesini olusturmadan Driver.java classindan cagirabilirsiniz

## .gitignore
- localinizde kalmasini istediginiz, jar,test result gibi dosyalari .gitignore file ina ekleyerek remote repo nuzu gereksiz dosyalardan koruyabilirisiniz

## NOT: PROJEYI INDIRDIKTEN SONRA UPDATE ETMEYI UNUTMAYINIZ