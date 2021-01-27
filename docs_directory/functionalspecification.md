0. Vezetői összefoglaló

Egy wellness hotel szeretne bevezetni egy készpénz nélküli fizetési rendszert, amellyel a vendégek egy speciális óra segítségével tudnak fizetni a szolgáltatásokért. Az órák és az óraolvasók előre installálásra kerültek, ezek interneten keresztül kommunikálnak. Ehhez kell megfelelő programot írni, adatbázist létrehozni. 

1. A rendszer céljai, és nem céljai

A rendszer célja egy szoftver létrehozása a már telepített terminálokhoz és órákhoz,melyek interneten keresztül tudnak kommunikálni.  A program tárolja és listázza azokat a szolgáltatásokat,melyeket a vendégek igénybe vettek. Ha szükséges részetes számlát kapnak az igénybe vett szolgáltatásokról.

2. Jelenlegi helyzet leírása

Egy  wellness hotel szeretne bevezetni egy készpénz nélküli fizetési rendszert, amellyel a vendégek egy speciális óra segítségével tudnak fizetni a szolgáltatásokért. Az órák és terminálok előre telepítve lettek. Ezek kommunikációjukhoz kell adatbázist, szoftvert készíteni.

3.Vágyálom rendszer leírása.

A fizetés az óra terminálhoz való érintéssel történik. A program tárolja és listázza azokat a szolgáltatásokat,melyeket a vendégek igénybe vettek. Ha szükséges részetes számlát kapnak az igénybe vett szolgáltatásokról.
Ez lehetővé teszi például a csoportoknak,hogy egy számlát tudnak közösen is fizetni. Egy óra indentifál egy személyt, de több személy is tud egy számlához tartozni.
Néhány szolgáltatás limitált például: kiskorúak nem vehetnek alkoholt és nem léphetnek be a szaunába.
Néhány szolgáltatást a személyzet által lehet elérni (barista), néhányat pedig beléptetőponthoz való érintéssel(belépés a szaunába).
A készülékek visszajelzést küldhetnek a tranzakcióról például: elfogadva, visszautasítva. Néhány készülék a hibákról rövidebb üzeneteket is képes megjeleníteni. Például, ha egy kiskorú be szeretne lépni a szaunába a belépést visszautasítja a szerver // Ha egy kiskorú szeretne alkoholt vásárolni a barista üzenetet kap arról,hogy a vásárló kiskorú.

4. A rendszerre vonatkozó pályázat, törvények, rendeletek, szabványok és ajánlások felsorolása.

A rendszerre vonatkozó külsö megszorítások közé tartoznak az alábbiak: - pályázat - törvények - rendeletek - szabványok és ajanlások.
 Tekintsük először a pályázatot. Pályázat elnyerése esetén eleget kell tenni a pályázatban leírt feltételeknek is. Nem elegendő a saját magunk elé kitűzott céldátum, hanem figyelembe kell venni azt is, hogy a pályázat mennyi időre szól és mikor jár le. Mindezek mellett pályázat esetén meghatározottak azok is, hogy a pályázaton elnyert pénzt, a projekt mely részében, a projekt mely elemeire használhatjuk fel. 
Törvény esetében figyelembe kell venni azt a tényt, hogy a projekt mely országon belül készül és mely országban/országokban szeretnék a későbbiekben ezt forgalmazni és használni. A programnak eleget kell tennie az összes forgalmazni kívánt ország törvényeinek. 
Ezeken kívül még lehetnek külön erre a célra alkalmazott rendeletek, amelyeket szinten figyelembe kell venni.
 Mivel Magyarországon készül el a program, így ez esetben törvényileg a magyar törvénykönyv szabályozásainak is meg kell felelnie. Összességét tekintve a gonololatjelek között és kapcsolat van, vagyis mindennek érvényesülnie kell egyszerre. Figyelembe kell venni a pályázati feltételeket, a törvényeket és rendeleteket és ügyeli kell a szabványokra. Ha az összes tényező közül bármelyik is hiányzik vagy hibás, akkor a projekt nem megfelelő és nem tökéletes.
Például a program semmiképp sem engedélyezheti,hogy kiskorú alkoholt vehessen illetve nem engedélyezheti a szauna használatát kiskorúak számára.

5. Jelenlegi üzleti folyamatok modellje

	1. Nincs program, illetve adatbázis,amely rögzíthetné a tranzakciókat.
	2. Már előre telepített terminálokhoz, órákhoz kell elkészíteni a szoftvert.
	3. Célunk egy készpénz nélküli fizetési rendszer kialakítása egy wellness hotel számára.

6. Igényelt üzleti folyamatok modellje

	1.	Egy wellness hotel szeretne készpénz nélküli fizetési rendszert felállítani.
	2.	Az órák és terminálok interneten keresztül kapcsolatban állnak egymással.
	3.	A program tárolja és listázza azokat a szolgáltatásokat,melyeket a vendégek igénybe vettek. Ha szükséges részetes számlát kapnak az igénybe vett szolgáltatásokról.
	4.	Nem minden szolgáltatást vehet igénybe egy-egy vendég. Ha egy vendég kiskorú nem vehet alkoholt,illetve nem használhatja a szaunát.
	5.	A rendszer lehetővé teszi például a csoportoknak,hogy egy számlát tudjanak közösen is fizetni. 
	6.	Egy óra indentifál egy személyt, de több személy is tud egy számlához tartozni.

7. Követelménylista

K1: Regisztrációs felület dolgozóknak. Kötelező mezők: id, alkalmazott neve, alkalmazott e-mail címe, jelszó, positionID	
K2: Login felület: a dolgozóknak biztosítani kell bejelentkező felületet. Kötelező mezők: id, alkalmazott neve, alkalmazott e-mail címe, jelszó, positionID	
K3: Logout felület: a dolgozóknak biztosítani kell kijelentkező felületet.
K4: Egy vendég felvétele a rendszerbe. Kötelező mezők: Név, Születési dátum, id
K5: Checkout : vendégek kijelentkezésére. Töröljük az adott id-vel rendelkező vendéget a rendszerből távozáskor.
K6: Hibabejelentő funkció.
K7: Login oldal, Error oldal.
K8: SummaryService felület,mely megjeleníti a vendégek milyen szolálgatások vettek igénybe. Ár megjelenítés.

8. Szereplők: - Dolgozó, vendég

Dolgozó használati esetei: 
- Regisztráció: A dolgozó tud regisztrálni. 
- Bejelentkezés: A dolgozó be tud jelentkezni, ha már regisztrált. 
- Kijelentkezés: A dolgozó ki tud jelentkezni.
-Check in: a dolgozó új vendéget tud felvenni a rendszerbe.
-Check out vendég: a dolgozó törli a vendéget a rendszerből, a vendég távozásakor.
-Check out számla: a dolgozó megjeleníti a vendég számára, milyen szolgáltatásokat, termékeket vett igénybe, majd összesíti a fizetendő árat a vendégnek.
Vendég használatai esetei: 
- Bejelentkezés (check in): a dolgozók felveszik az új vendég adatait.
-Check out vendég: a dolgozó törli a vendéget a rendszerből, a vendég távozásakor.
-Check out számla: a dolgozó megjeleníti a vendég számára, milyen szolgáltatásokat, termékeket vett igénybe, majd összesíti a fizetendő árat a vendégnek.
- A vendég a speciális óra segítségével fizethet a szolgáltatásokért.

9. Követelményspecifikáció megfeleltetése
	a)	Dolgozó Regisztráció
	b)	Dolgozó Bejelentkezés
	c)	Dolgozó Kijelentkezés
	d)	Vendég adatainak felvétele
	e)	Adatbázis feltöltése adatokkal
	f)	Vendég adatainak a törlése a rendszerből, távozáskor
	g)	Használatba vett szolgáltatások rögzítése
	h)	Számla megjelenítése

10. Képernyőtervek

11. Forgatókönyvek:

Dolgozó:  Regisztráció után be- és ki tud jelentkezni. Fel vehet új vendéget, törölhet egy vendéget, a számla bemutatása a vendégnek. 
Vendég: a speciális óra segítségével szolgáltatásokat vehet igénybe. Megérkezéskor a dolgozók vehetik fel az új vendéget a rendszerbe, illetve távozás előtt megkapja a számlát, ha szükséges a részletes listát az igénybe vett szolgáltatásokról. Távozáskor a dolgozók törlik a vendég adatait a rendszerből.

12. Fogalomszótár:

-bug: fejlesztési hiba ami által a program nem a várt eredményt hozza 
-backend: A kiszolgáló, ahonnan az alkalmazást el lehet érni 
-frontend:  egy réteg ami feladata a rendszerbõl kijutó adatok prezentálása, illetve a bejövõ adatok fogadása
-web-service:különbözõ programnyelveken írt és különbözõ platformokon futó szoftveralkalmazások interneten keresztül történõ adatcseréjére használt webszolgáltatások.
-dolgozói felület: A dolgozónak lehetősége van vendég felvételére, illetve vendég törlésére a rendszerből. Megjelenítheti egy vendég által igénybe vett szolgáltatásokat részletesen, illetve ezek összesített árát. 
- vendég: a wellness hotel vendége, akinek bejelentkezéskor egy dolgozó felveszi az adatait.
-dolgozó: a wellness hotel alkalmazotja, megfelelő dolgozói id birtokában tud felvenni, illetve törölni vendégeket a rendszerből.

