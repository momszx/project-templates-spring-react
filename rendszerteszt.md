# Rendszerterv

### A rendszer célja

A rendszer célja a wellness szolgáltatások egyszerű kifizetése és az életkor által okozható problémák kiküszöbölése. A badge használata lehetővé teszi, hogy a használója az adott napra a feltöltött egyenleget költhesse. A karóra a nap végén vissza adandó,  A rendszer az adatokat az adatbázisból kapja.

### Projektterv
Résztvevők és főbb szerepköreik: Backend: Kungl Rebeka, Zsák Zoltán. Frontend: Heim József, Nagy Milán.

### Üzleti folyamatok modellje
A user egy órát kap, ahol meg kell adnia az életkorát, nevét, személyes adatait.
A karórát lecsipogtatva tud a felhasználó fizetni.

### Követelmények
Funkcionális követelmények: - Felhasználó adatainak tárolása

Nem funkcionális követelmények: - Letisztult, felhasználóbarát felület - Betöltés és mentés gyors működése - Optimalizáltság

### Törvényi előírások, szabványok: - GDPR-nak való megfelelés - Általános információk - Szellemi tulajdon - Használat - Felelősségi szabályok - Technikai követelmények - Garancia és kártérítés - 2013. évi V. törvény - Európai Parlament és Tanács 2016. április 27-i (EU) 2016/679 Rendelete - 2011. évi CXII. törvény - a szerzői jogról szóló 1999. évi LXXVI. törvény - 2001. évi CVIII. törvény

### Architekturális terv
A rendszerhez szükség van egy adatbázis szerverre, ebben az esetben MySql-t használunk. A program React és Spring Boot keretrendszer használatával készül el.

### Adatbázis
A tervezett szolgáltatás jellegét tekintve egy központi adatbázis használata elengedhetetlen. A felhasználók, és azok adatainak rögzítése, tárolása és rendszerezése céljából a modern adatbáziskezelés konvenciói a legcélravezetőbbek. Arra, hogy ezeket implementálhassuk, a MySQL rendszerét választottuk, az ismeretségeink tudatában, és a megbízhatóság fényében.

### Funkcionális terv
Rendszerszereplők: Felhasználók

### Fejlesztői eszközök:
IntelliJ IDE, Webstrom
MySQL Workbench
A rendszer elkészítését Java + JavaScript, illetve React nyelven tervezzük. A felhasználók adatai egy MySQL adatbázisban lesznek tárolva.

### Teszt terv
A tesztelések célja a rendszer és komponensei funkcionalitásának teljes vizsgálata, ellenőrzése, a rendszer által megvalósított üzleti szolgáltatások verifikálása.

### Tesztelési eljárások

Unit teszt: A teszt elsődleges célja: az eddig meglévő funkcióknak a különböző karóra leolvasó helynél való kompatibilitásának tesztelése. A tesztet a fejlesztők végzik. Az eljárás sikeres, ha különböző személyeknél a megfelelő szolgáltatások hibátlanul működnek a az óra felhasználásával. A teszt időtartama egy hét.

### Karbantartási terv
Az alkalmazás folyamatos üzemeltetése és karbantartása, mely magában foglalja a programhibák elhárítását, a belső igények változása miatti módosításokat, valamint a környezeti feltételek változása miatt megfogalmazott program-, illetve állomány módosítási igényeket. A jövőben szükség lehet új hardware implementációra igénynövekedés esetén. Adaptive Maintenance: A program naprakészen tartása és finomhangolása. Perfective Maintenance: A szoftver hosszútávú használata érdekében végzett módosítások, új funkciók, a szoftver teljesítményének és működési megbízhatóságának javítása. Preventive Maintenance: Olyan problémák elhárítása, amelyek még nem tűnnek fontosnak, de később komoly problémákat okozhatnak.