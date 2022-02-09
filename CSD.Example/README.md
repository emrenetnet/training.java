CSD tarafından sağlanan örnek kodların kendimce tekrar yazılması, hatalarının giderilmesi.

Chip60
Bir ile doksan arasında sayıların arasından altmış adet sayı seçilir. Üzerinde beş değişik sayı bulunan kartlardan bir tane çekip eğer altmış sayı içerisinde karttaki beş sayı var ise oyunun görevi yerine getirilmiş olunur. Oyun kazanma olasılığını hesaplar. Lütfen kodu derleyip çalıştırıp oyunu görmeniz gerekir. 

Amiral Battı Oyunu (kaynak kod sağlayıcı Ali Vefa Serçe eğitmenimize teşekkür ederim.)
  
  Oyun 10x10 matriste oynanıyor.<br/>
  Birlik, ikilik, üçlük, dörtlük olmak üzere dört farklı boyutta gemi vardır. 
  Birlik gemiden dört tane, ikilik gemiden üç tane, üçlük gemiden iki tane, dörtlük gemiden bir tane vardır.
  Gemiler rastgele yerleştiriliyor.
  Gemilerin yönü yatay, dikey olabilir, çapraz olamaz.
  Gemiler bitişik olamaz.
  
  Düzeltmeler
  Keyboard nesnesi tanımlı değildi. Keyboard nesnesini Scanner sınıfından oluşturdum.
  Scanner Keyboard = new Scanner (System.in);
