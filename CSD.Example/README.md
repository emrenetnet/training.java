CSD tarafından sağlanan örnek kodların kendimce tekrar yazılması, hatalarının giderilmesi.

Chip60
Bir ile doksan arasında sayıların arasından altmış adet sayı seçilir. Üzerinde beş değişik sayı bulunan kartlardan bir tane çekip eğer altmış sayı içerisinde karttaki beş sayı var ise oyunun görevi yerine getirilmiş olunur. Oyun kazanma olasılığını hesaplar. Lütfen kodu derleyip çalıştırıp oyunu görmeniz gerekir. 

Amiral Battı Oyunu (kaynak kod sağlayıcı Ali Vefa Serçe eğitmenimize teşekkür ederim.)<br/>
Oyun 10x10 matriste oynanıyor.<br/>
Birlik, ikilik, üçlük, dörtlük olmak üzere dört farklı boyutta gemi vardır.<br/>
Birlik gemiden dört tane, ikilik gemiden üç tane, üçlük gemiden iki tane, dörtlük gemiden bir tane vardır.<br/>
Gemiler rastgele yerleştiriliyor.<br/>
Gemilerin yönü yatay, dikey olabilir, çapraz olamaz.<br/>
Gemiler bitişik olamaz.<br/>
Düzeltmeler<br/>
Keyboard nesnesi tanımlı değildi. Keyboard nesnesini Scanner sınıfından oluşturdum.<br/>
Scanner Keyboard = new Scanner (System.in);<br/>

Mayın Tarlası Oyunu<br/>
Oyun 10x10'luk matris ile oynanıyor.<br/>
Program üç temel bölümden oluşur. Birinci bölümde oyun alanına rastgele yirmibeş mayın yerleştiriliyor. İkinci bölümde mayın olmayan hücrelerin etrafındaki mayınlar sayılıyor, bu hücrelere yazılıyor. Üçüncü bölümde ise oyun oynanıyor. <br/>
Oyuncunun hamleleri ikinci bir matriste tutuluyor. <br/>

