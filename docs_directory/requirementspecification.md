0.	Áttekintés
Az alkalmazásunk egy wellness hotel számára készül. Lényege, hogy a vendégek készpénz nélkül tudjanak fizetni a már előre telepített és beszerzett órákkal és terminálokkal. Adatbázisban tároljuk az igénybe vett szolgáltatásokról. Így jön létre a vendég számlája, illetve így köthető a vendég ( vagy több vendég) egy számlához. A dolgozók feladata a vendég adatainak rögzítése érkezéskor, illetve a vendég törlése a rendszerből távozáskor.

1. Jelenlegi üzleti folyamatok modellje

	1. Nincs program, illetve adatbázis,amely rögzíthetné a tranzakciókat.
	2. Már előre telepített terminálokhoz, órákhoz kell elkészíteni a szoftvert.
	3. Célunk egy készpénz nélküli fizetési rendszer kialakítása egy wellness hotel számára.

2. Igényelt üzleti folyamatok modellje

	1. Egy wellness hotel szeretne készpénz nélküli fizetési rendszert felállítani.
	2. Az órák és terminálok interneten keresztül kapcsolatban állnak egymással.
	3. A program tárolja és listázza azokat a szolgáltatásokat,melyeket a vendégek igénybe vettek.Ha szükséges részetes számlát kapnak az igénybe vett szolgáltatásokról.
	4.  Nem minden szolgáltatást vehet igénybe egy-egy vendég. Ha egy vendég kiskorú nem vehet alkoholt,illetve nem használhatja a szaunát.
	5.  A rendszer lehetővé teszi például a csoportoknak,hogy egy számlát tudjanak közösen is fizetni. 
	6.  Egy óra indentifál egy személyt, de több személy is tud egy számlához tartozni.

3. Követelmény lista

K1: Regisztrációs felület dolgozóknak. Kötelező mezők: id, alkalmazott neve, alkalmazott e-mail címe, jelszó, positionID	
K2: Login felület: a dolgozóknak biztosítani kell bejelentkező felületet. Kötelező mezők: id, alkalmazott neve, alkalmazott e-mail címe, jelszó, positionID	
K3: Logout felület: a dolgozóknak biztosítani kell kijelentkező felületet.
K4: Egy vendég felvétele a rendszerbe. Kötelező mezők: Név, Születési dátum, id
K5: Checkout : vendégek kijelentkezésére. Töröljük az adott id-vel rendelkező vendéget a rendszerből távozáskor.
K6: Hibabejelentő funkció.
K7: Login oldal, Error oldal.
K8: SummaryService felület,mely megjeleníti a vendégek milyen szolálgatások vettek igénybe. Ár megjelenítés.

4. Vágyálomrendszer

V1:Az ideális rendszerbe új dolgozókat tudunk regisztrálni, illetve a dolgozók új vendégeket tudnak rögzíteni.
V2:Az olvasó eltárolja az igénybe vett szolgáltatásokat.
V3: Néhány szolgáltatás csak a vendégek egy csoportja számára elérhető. (kiskorúak nem vehetnek alkoholt, nem mehetnek be a szaunába)
V4: A vendég adatainak törlése távozáskor.
V5: A vendég részletes számlát kaphat az igénybe vett szolgáltatásokról.
V6: Egy számlához több vendég is kapcsolódhat (például egy család esetén).
V7: Egy dolgozó számára elkészített bejelentkezés és kijelentkezés funkció.

5. Szellemi tulajdon

Az Alkalmazás és valamennyi kapcsolódó védjegy, szerzői jogi alkotás és egyéb – akár bejegyzett, akár be nem jegyzett – szellemi tulajdon (a továbbiakban együttesen: Szellemi Tulajdon) tulajdonosa a wellness hotel, valamint az alkalmazáshoz kedvezményt nyújtó partnerek. A Felhasználók az Alkalmazást a Szellemi Tulajdon maximális tiszteletben tartásával jogosultak használni. A Szellemi Tulajdon kiterjed különösen, de nem kizárólagosan valamennyi szoftverre, logóra, márkajelre, márkanévre, fényképre, szövegre, grafikára, adatbázisra. A Szellemi Tulajdonnak tilos bárminemű megsértése, bitorlása, másolása, átdolgozása és tilos azt bármilyen egyéb módon megsérteni, azt jogosulatlanul felhasználni, továbbadni, megterhelni, azzal bármilyen módon rendelkezni, visszaélni. Ezen szabályok megsértése az Alkalmazás használati lehetőségeinek azonnali hatályú megszüntetése mellett a megfelelő jogi lépések megtételét – beleértve esetleges büntetőjogi lépések megtételét is – vonja maga után a Felhasználóval, más jogsértő személlyel szemben a Tulajdonos és/vagy a Szellemi Tulajdon egyéb jogosultjai által.

6.Használat

Az Alkalmazás Felhasználói  a  wellness hotel dolgozói. A dolgozók megfelelő hozzáféréssel rendelkezve vehetnek fel vendégeket a rendszerbe.

7.Felelősségi szabályok

Ha a kapcsolat (bármely okból) megszakad a kiszolgáló webhelyével, abban az esetben az adatok elvesztéséért a Tulajdonos semmilyen felelősséget nem vállal. 
A Tulajdonos és az Üzemeltető a rendelkezésére álló eszközökkel biztosítja, hogy az Alkalmazás használata technikai szempontból biztonságosnak minősüljön. Az Alkalmazáshoz való csatlakozás miatt bekövetkező károkért, az internetes hálózat esetleges üzemkimaradásából, az elérési út hibájából, bármely nem várt technikai hibából eredő adatvesztésért, vírusból, vagy más károkért a Tulajdonos nem felelős. A Felhasználóknak minden esetben fel kell mérniük, hogy rendelkeznek-e az Alkalmazás használatához szükséges ismeretekkel, technikai követelményekkel és teljesítményekkel.

8.Technikai követelmények

Az Alkalmazás használatához szükséges technikai feltételek: használathoz megfelelő sávszélességű internetelérés.. A technikai feltételek nem teljesüléséért a Tulajdonos nem vonható felelősségre. Ugyanígy nem vonható felelősségre a Tulajdonos az Alkalmazás használatából a készüléken bekövetkező adatvesztésért, meghibásodásért. 

9.Garancia és kártérítés

A fent említett technikai feltételek nem teljesüléséért a Tulajdonos nem vonható felelősségre. A Tulajdonos nem vállal garanciát az Alkalmazás megszakításmentes működéséért, valamint vis major hibákért. Az ebből eredő adatvesztésért, tartalom vesztésért a Tulajdonos szintén nem tartozik kártérítési felelősséggel.
