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

