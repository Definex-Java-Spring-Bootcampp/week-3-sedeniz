[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/b5ww4GXt)
# 3.Hafta Ödevi

1. Aşağıdaki kavramları örneklerle açıklayın. `(10 PUAN)`

>• **Unit test:** Unit test, yazılım geliştirme sürecinde uygulamanın küçük ve izole birimlerinin (örneğin metodlar) doğru şekilde çalıştığını doğrulamak için yapılan test türüdür. Bu testler, kodun belirli parçasının beklenen outputu üretip üretmediğini kontrol eder. Örneğin, bir hesap makinesi uygulamasında add fonksiyonunun iki sayıyı doğru şekilde toplayıp toplamadığını kontrol etmek için bir unit test yazılabilir:
```
// Toplama fonskiyonu
public int add(int num1, int num2) {
    return num1 + num2;
}

// Fonksiyonu test edebilmek için unit test örneği
@Test
public void testAdd() {
    assertEquals(5, add(2, 3));
}
```

>• **Integration test:** Integration test, birbirleriyle iletişim halinde olan iki veya daha fazla uygulama bileşeninin (modüller, servisler, veritabanları gibi) birlikte doğru şekilde çalışıp çalışmadığını doğrulamak için yapılan test türüdür. Bu farklı bileşenlerin entegrasyonunun sorunsuz olduğunu ve aralarındaki arayüzlerin doğru şekilde çalışıp çalışmadığını test eder. Örneğin, bir e-ticaret uygulamasında müşterilerin sipariş oluşturduğu bir Sipariş Servisi ve ödemelerin işlendiği bir Ödeme Servisi bulunduğunu varsayalım. İki servis arasındaki entegrasyonu test etmek için, bir kullanıcının sipariş oluşturduğu ve bu sipariş için ödeme yapıldığı bir senaryo simüle edilebilir.

>  (Unit ve integration testler illa yazılımın parçalarının doğru çalışmasını test etmek için kullanılmaz, aynı zamanda uygulamanın error verebileceği durumlara veya beklenmeyen inputlara karşı davranışını da kontrol etmek için kullanılırlar. Yazılımın bu tarz durumlarla karşılaştığında nasıl tepki verdiğini belirlemeye yardımcı olur, böylece daha sağlam ve dayanıklı sistemler inşa edilebilir.)



3. Aşağıdaki özellikleri **kredinbizde** uygulamasına ekleyin. `(40 PUAN)`  
• Kredinbizde uygulaması için Garanti bankası için client oluşturun.  
• Kullanıcı Garanti bankası için kredi başvurusu yapabilmelidir.  
• Kullanıcı yapmış olduğu bütün başvuruları görüntüleyebilmelidir.  
• NotificationService için EMAIL,SMS,MOBILE_NOTIFICATION işlemlerini strateji pattern kullanarak implemantasyonu gerçekleştirin.  

4. Docker ile Kafka kurulumu gerçekleştirin ve exception alındığı durumlarda Kafka ile bütün loglar toplanmalı ve MongoDB üzerinde kaydedilmelidir. `(20 PUAN)`

5. Birinci ödevde yaptığınız müşteri, fatura, sipariş ve ürün ile oluşturduğunuz projenizi ayrı servisler olacak şekilde bölün ve aşağıdaki geliştirmeleri ekleyin. `(30 PUAN)`  
• GW ekleyin.  
• Discovery server ekleyin.  
• Fatura bilgilerinin asenkron oluşmasını sağlayan yapıyı kurun.  
• GlobalExceptionHandler ekleyin.  

---
*Eğitmen - Cem DIRMAN*  
*Kolay Gelsin*
