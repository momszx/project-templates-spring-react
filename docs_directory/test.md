# Tesztjegyzőkönyv

### Main Project

|  Dokumentum címe: (azonosítója) |  team3_afp1 - "project-templates-spring-react" |
|---|:-:|
| **Minősítés: (állapot)**  |  Jóváhagyott |
| **Verziószám:**  |  ALFA 0.1 |
| **Projekt név:** |  project-templates-spring-react|
| **Készítette:** | team3_afp1 |
| **Utolsó mentés kelte:** | 2020.01.16 |
| **Dokumentum célja:** | A projekt aktualis állapotának bemutatása   |
| **Fájlnév** | test.md |

### Projektben résztvevő fejlesztők:

|  Név | Szerepkör |
|---|:-:|
| Donkó Róbert Márk |  Projekt manager, Test maneger |
| Kungl Rebeka  |  Backend fejlesztő |
| Zsák Zoltán | Backend fejlesztő |
| Nagy Milán  |  Frontend fejlesztő |
| Heim József | Frontend fejlesztő |

## 1. Bevezetés
Tesztelés célja a projektben megtalálható struktúrális és design hibák feltárása.

### 1.1 Tesztelési terv hatóköre, célja:

- A tesztelési terv célja a tesztelés teljes körűségének biztosítása, a tesztelés során alkalmazott eljárások és megoldások meghatározásával.
- A teszt végrehajtásáért ez esetben a test manager fele , és a tesztekést azt általa összeállított tesztcsapat hajtja végre.

### 1.2 Elvárások
#### Az alábbi alap elvárások képezik ennek a teszttervnek az alapját:
- Az olvasó ismeri az alapdokumentumokat, amelyek meghatározzák a rendszert. 
- Az **team3_afp1** projektcsapat felelős a tesztadatok előállításáért.

## 2 Szükséges erőforrások
Ez a fejezet a teszteléshez szükséges erőforrásokat fejti ki.

### 2.1 Feladatkörök és felelősségek (tesztcsapat meghatározása)
| Feladatkör  |  Felelősség/tevékenység |  Személy  |
|---|---|---|
|  **Tesztelő, Teszt-koordinátor:** |  A teszt végrehajtása, észrevételek dokumentálása, teszt dokumentáció archiválása.Teszt terv készítése.  A tesztterv jóváhagyatása a projektmenedzserrel.  Teszt forgatókönyvek létrehozása  Inkonzisztenciák kezelése.  Helyes és időbeni hibakezelés.  Szükség esetén problémák eszkalálása a projekt menedzsernek.  Végső riport készítése.  Teszt dokumentum archiválása.  Az észrevételek státuszának követése, ill. dokumentálása |  Heim József |
|**Projektvezető:**| Teszt terv jóváhagyása  Teszt forgatókönyv (testscript)| Donkó Róbert Márk |

### 2.2 Tesztkörnyezet
| Környezet neve és feladata  |  A hozzáférés módja | Konfiguráció  |
|---|---|---|
| Intellij idea | Offline - Szabad szoftver | Windows 10 - alapértemezett beállítások |
| MYSQL workbench  | Offline - Szabad szoftver | Windows 10 - alapértemezett beállítások |

### 2.3 Tesztadatok
A teszt végrehajtásához szükséges rekordok (tesztadatok) száma: 3
A tesztadatok elkészítéséért és feltöltéséért felelős személy: Kungl Rebeka

A tesztadatoknak az alábbi követelményeknek kell megfelelniük:
- Az adatbázisba felvitt adatoknak csak is az UTF-8 kódtáblában található karaktereket szabad tartalmaznia.

### 2.4 Leszállítandó teszt dokumentumok

| Cím  |  Felelős személy | Szállítási gyakorisága  | Szállítás módja |
|---|---|---|---|
|  **GUI teszt - IDL** |  Heim József |  Egyszeri |  github repository |
|  **SQL teszt** | Zsák Zoltán |  Egyszeri | github repository  |

### 2.5 Tesztelési eszközök
- Intellij idea *Fejlesztői környezet* [LINK](https://www.jetbrains.com/idea/)
- Mysql workbench *mysql workbench* [LINK](https://www.mysql.com/products/workbench/)

## 3 Tesztelési terv
Ez a fejezet leírja a teszt típusát, a metodológiáját és a riport készítés módszerét. Emellett meghatározza a teszt elvárásokat, a teszt-esetek elvárt eredményeit, sikerességének kritériumait, a kockázatok kezelését és a hatáskörön kívül eseteket.

### 3.1 Fejlesztői teszt
A fejlesztői tesztelés célja a rendszer alapvető funkcióinak ellenőrzése, a hibakezelés és az alapvető funkciók működésének vizsgálata
**Módszere:**
A program SQL adatbázisa "DUMMY" (*Nem valós*) adatokkal kerül feltültésre a tesztelés adat.

### 3.2 Prototípus (modul) teszt
A prototípustesztelés (vagy másik nevén modultesztelés) célja a rendszer már működő moduljainak önálló tesztelése, a modulon belüli hibák azonosításának és kiküszöbölésének érdekében. 
**Módszere:** 
A szegmensek validálása egyénileg történik. A tesztelés visszont a szegmensek föggőségeire is ki terjed.

### 3.3 Integrációs teszt
Az integrációs teszt célja a rendszer más rendszerekhez történő illesztésének vizsgálata, a több rendszereken keresztül átívelő funkciók tesztelésének érdekében. Az adatmigrációs tesztelés az integrációs teszteléshez tartozik, ennek lényege, hogy a bevezetendő rendszerbe áttöltik azokat az adatokat, amelyekkel a rendszer dolgozni fog és letesztelik a betöltött adatok, illetve az adatokat kezelő funkciók helyességét. 
**Módszere:**
A program adatbázisába valós adatok kerülnek betöltésre.

### 3.4 Elfogadási teszt
Az elfogadási teszt (angolul User Acceptance Test) célja a rendszer teljes funkcionalitásának vizsgálata a felhasználók szemszögéből
**Módszere:**
A teszt egy kontrol csoportal zajlik, egy külső cégen keresztül.

### 3.5 Terheléses teszt
A terheléses teszt célja a tervezett kapacitások, valamint a rendelkezésre álló növekedési potenciál meghatározása.
**Módszere:**
A próba telepítést követően egy meghívott teszt közönéggel zajlik, szimulálva egy átlagos napi használatot.

### 3.6 Biztonsági teszt (audit):
Biztonsági tesztelésre akkor van szükség, ha a rendszer szenzitív (pl. személyes vagy pénzügyi) adatokat kezel, vagy szabadon elérhető az internetről. 
**Módszere:**
A tesztett egy megbízott külső cég végzi.

### 3.7 Go live teszt
A go-live teszt egy próbaélesítés, melynek során a korábbi rendszerek továbbra is üzemelnek annak érdekében, hogy az élesítéskor keletkező problémák ne befolyásolják a normál üzemi működést.
**Módszere:**
A próba telepítés a megrendelő által választott webtárhelyen történik, a programot a jövőben üzemeltető adminisztrátorok közreműködésével.

### 3.8 Tesztelési feladatok, teszt-esetek leírása
A tesztelési feladat a következő teszt-eseteket foglalja magában:
- Fejlesztői teszt
- Prototípus (modul)

## 4 Tesztelési ütemterv, függőségek – tesztforgatókönyv
### Tesztelési jegyzőkönyv
A tesztelők a tesztforgatókönyvnek megfelelően elvégzik a tesztelést és az eredményt tesztjegyzőkönyvekben dokumentálják. A teszt kimenetelést minden esetben jelenteni kell a tesztkoordinátornak. A tesztkoordinátor a szakértőkkel együtt megoldást keres a problémákra, majd frissíti a tesztforgatókönyvet. Ha a problémát megoldották, a tesztelő újrakezdheti a tesztelést, majd dokumentálja az eredményeket. Ha a hiba továbbra is fennáll, és harmadik félen múlik a megoldása eszkalálni kell a problémát a projekt menedzsernek. 

### 4.2 Tesztelési jelentés
A tesztelési jelentést a tesztkoordinátor készíti el. Ez egy részletes áttekintése a lefutott teszteknek, azok eredményeinek, státuszának és a megjegyzéseknek.
A tesztkoordinátor juttatja el a projektmenedzsernek a tesztelési jelentést. 

### 4.3 Tesztelt elvárások 
Az alábbi funkcionális elvárások szerepelnek az üzleti illetve fejlesztői specifikációban, amelyek tesztelésre is kerültek: 
> A dokumentum átdolgozás alatt (Hiányzó tesztelési elvárás a üzleti illetve fejlesztői specifikációban).

| #  | Leírás |
|---|---|
| 1. |   |
| 2. |   |
| 3. |   |

Az alábbi nem-funkcionális elvárások szerepelnek az üzleti illetve fejlesztői specifikációban, amelyek tesztelésre is kerültek: 

| #  | Leírás |
|---|---|
| 1. |  bejletkezés,regisztráció funkcó tesztelése |
| 2. |  adatbázissal való kommunikáció tesztelése |
| 3. |  backend és frontend felület kommunikációjának tesztelése |

Az alábbi elvárások szerepelnek az üzleti illetve fejlesztői specifikációban, amelyek nem kerültek tesztelésre: 
> A dokumentum átdolgozás alatt (Hiányzó tesztelési elvárás a üzleti illetve fejlesztői specifikációban).

| #  | Leírás |
|---|---|
| 1. |   |
| 2. |   |
| 3. |   |

### 4.4 Elfogadási kritériumok
- Technikai, a teszt forgatókönyvben leírtak szerint.
- A projekt menedzser jóváhagyása a teszt leszállítandókra

## 5 Tesztjegyzőkönyv
### 5.1 Tesztelési jegyzőkönyv - 1. Bejletkezés, regisztráció funkcó tesztelése

|   |   |
|---|---|
| A teszt-eset leírás és célja:  | A bejelentkezés menüpont tesztelése |
| A tesztelt folyamat/funkció leírása:  |  A felület viselkedése hibás felhasználónév / jelszó megadása esetén, megfelelő adatok esetén illetve többszöri hibás bevitelekor, továbbá új felhasználó fiók sikeres-e regisztrálása  |
| A tesztelés előfeltételei:  |  A programnak rendelkeznie kell minimum egy dummy adatbázissal |
| A tesztelés dátuma és időpontja:  |  2020.01.06 10:25 |
| A tesztadatok típusa:  | N/A  |
| A tesztet végző személy(ek):  | Donkó Róbert Márk  |
| A tesztelt rendszer beállításai:  | A program specifikációjában szereplő alap beálítások  |
| A teszt-eset elvárt eredménye:  |  A specifikációban taglalt viselkedés |
| A tesztelés eredménye:  | **Megfelelt/élesíthető**  |
| Megjegyzések:  | -  |

**Tesztelést elvégezte**

|   |   |
|---|---|
|  Név: |  Donkó Róbert Márk |
|  Szervezeti egység/ beosztás: | Projekt manager, Test maneger  |
|  Dátum: |  2020.01.06 11:15  |

### 5.2 Tesztelési jegyzőkönyv - 2. adatbázissal való kommunikáció tesztelése

|   |   |
|---|---|
| A teszt-eset leírás és célja:  | adatbázissal való kommunikáció tesztelése |
| A tesztelt folyamat/funkció leírása:  |  Az alkalmazás adatbázisból lekérés, és egyé műveleteinek tesztelése |
| A tesztelés előfeltételei:  |  A programnak rendelkeznie kell minimum egy dummy adatbázissal |
| A tesztelés dátuma és időpontja:  |  2020.01.06 11:38 |
| A tesztadatok típusa:  | szöveg  |
| A tesztet végző személy(ek):  | Donkó Róbert Márk  |
| A tesztelt rendszer beállításai:  | A program specifikációjában szereplő alap beálítások  |
| A teszt-eset elvárt eredménye:  |  A szovegszerkesztó optimális működése |
| A tesztelés eredménye:  | **Megfelelt/élesíthető**  |
| Megjegyzések:  | -  |

**Tesztelést elvégezte**

|   |   |
|---|---|
|  Név: |  Donkó Róbert Márk |
|  Szervezeti egység/ beosztás: | Projekt manager, Test maneger  |
|  Dátum: |  2020.01.06 12:15  |

### 5.3 Tesztelési jegyzőkönyv - 3. backend és frontend felület kommunikációjának tesztelése

|   |   |
|---|---|
| A teszt-eset leírás és célja:  | A backend és frontend sikeres kommunikációja
| A tesztelt folyamat/funkció leírása:  | Az alkalmazás részei megfelelően kommunikálnak egymással|
| A tesztelés előfeltételei:  |  A programnak rendelkeznie kell minimum egy dummy adatbázissal  |
| A tesztelés dátuma és időpontja:  |  2020.01.06 13:31 |
| A tesztadatok típusa:  | szöveg |
| A tesztet végző személy(ek):  | Donkó Róbert Márk  |
| A tesztelt rendszer beállításai:  | A program specifikációjában szereplő alap beálítások  |
| A teszt-eset elvárt eredménye:  |  A specifikációban taglalt viselkedés |
| A tesztelés eredménye:  | **Nem felelt meg**  |
| Megjegyzések:  | -  |

**Tesztelést elvégezte**

|   |   |
|---|---|
|  Név: |  Donkó Róbert Márk |
|  Szervezeti egység/ beosztás: | Projekt manager, Test maneger  |
|  Dátum: |  2020.01.06 13:58  |

### 5.4 Jóváhagyások

|   |   |
|---|---|
|  Név: |  Donkó Róbert Márk |
|  Szervezeti egység/ beosztás: | Projekt Manager  |
|  Dátum: |  2020.01.07 11:00  |

## 6 Tesztelési jelentés 

### 6.1 Tesztelési jelentés -  1. Bejelentkezés, regisztráció funkció tesztelése 
|   |   |
|---|---|
| A hivatkozott tesztjegyzőkönyvek rövid leírása és eredménye:  | "A bejentkezés és regisztráció opció lépésről lépésre tesztelésre került hibás és megfelelő adatokkal, a connection miatt nem működik megfelelően" |
| A tesztelt folyamatok/funkciók/modulok leírása: | Insert, Select |
| A tesztadatok típusa:  | String, int  |
| A tesztelt rendszer beállításai:  | A program specifikációjában szereplő alap beálítások  |
| A tesztelés eredménye:  | **élesíthető**  |
| Megjegyzések:  | BUG |

**Tesztelést elvégezte**

|   |   |
|---|---|
|  Név: |  Donkó Róbert Márk |
|  Szervezeti egység/ beosztás: | Projekt Manager  |
|  Dátum: |  2020.01.06 12:15  |
|   |   |
|  Név: |  Heim József  |
|  Szervezeti egység/ beosztás: |  Vezető adatbázis fejlesztő |
|  Dátum: |  2020.01.06 14:36  |

### 6.2 Tesztelési jelentés - 2. adatbázissal való kommunikáció tesztelése
|   |   |
|---|---|
| A hivatkozott tesztjegyzőkönyvek rövid leírása és eredménye:  | "Az alkalmazás Lájk, Dislike funkció tesztelése" |
| A tesztelt folyamatok/funkciók/modulok leírása: | Az alkalmazás adatbázisból lekérés, és egyé műveleteinek tesztelése  |
| A tesztadatok típusa:  | szöveg  |
| A tesztelt rendszer beállításai:  |A program specifikációjában szereplő alap beálítások  |
| A tesztelés eredménye:  | **Megfelelt/élesíthető**  |
| Megjegyzések:  | -  |

**Tesztelést elvégezte**

|   |   |
|---|---|
|  Név: |  Donkó Róbert Márk |
|  Szervezeti egység/ beosztás: | Test manager  |
|  Dátum: |  2020.01.06 12:15  |


### 6.3 Tesztelési jelentés - 3. backend és frontend felület kommunikációjának tesztelése
|   |   |
|---|---|
| A hivatkozott tesztjegyzőkönyvek rövid leírása és eredménye:  | "Az alkalmazás részei megfelelően kommunikálnak egymással " |
| A tesztelt folyamatok/funkciók/modulok leírása: |  Az alkalmazás részei megfelelően kommunikálnak egymással |
| A tesztadatok típusa:  | szöveg  |
| A tesztelt rendszer beállításai:  | A program specifikációjában szereplő alap beálítások  |
| A tesztelés eredménye:  | **Nem felelt meg**  |
| Megjegyzések:  | -  |

**Tesztelést elvégezte**

|   |   |
|---|---|
|  Név: |  Donkó Róbert Márk |
|  Szervezeti egység/ beosztás: | Test manager  |
|  Dátum: |  2020.01.07 11:35  |


