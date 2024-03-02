
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main{
    public static int turnCount = 0;
    public static Country player1;
    public static Country player2;
    public static Country player3;
    public static Country player4;
    public static Country player5;
    public static Country player6;
    public static Country player7;
    public static Country player8;
    public static String map = "";
    public static Boolean simBots = true;
    public static final int
            revolt = 0,
            opec = 1,
            southAmerican = 2,
            orthodox = 3,
            asean = 4,
            african = 5,
            spanish = 6,
            northAmerican = 7,
            french = 8,
            eastern = 9,
            allies = 10,
            english = 11,
            arctic = 12,
            axis = 13,
            muslim = 14,
            brics  = 15,
            mongol = 16,
            soviets = 17,
            european = 18,
            smallNations = 19,
            colonies = 20;



    public static void main(String[] args) {

//Initializations

        ArrayList<Country> uSTouching = new ArrayList<>();
        ArrayList<Country> mexicoTouching = new ArrayList<>();
        ArrayList<Country> canadaTouching = new ArrayList<>();
        ArrayList<Country> eSTouching = new ArrayList<>();
        ArrayList<Country> icelandTouching = new ArrayList<>();
        ArrayList<Country> uKTouching = new ArrayList<>();
        ArrayList<Country> frTouching = new ArrayList<>();
        ArrayList<Country> germTouching = new ArrayList<>();
        ArrayList<Country> russTouching = new ArrayList<>();
        ArrayList<Country> polTouching = new ArrayList<>();
        ArrayList<Country> japTouching = new ArrayList<>();
        ArrayList<Country> chinTouching = new ArrayList<>();
        ArrayList<Country> indTouching = new ArrayList<>();
        ArrayList<Country> ukrTouching = new ArrayList<>();
        ArrayList<Country> spainTouching = new ArrayList<>();
        ArrayList<Country> iranTouching = new ArrayList<>();
        ArrayList<Country> brTouching = new ArrayList<>();
        ArrayList<Country> egyTouching = new ArrayList<>();
        ArrayList<Country> australiaTouching = new ArrayList<>();
        ArrayList<Country> italyTouching = new ArrayList<>();
        ArrayList<Country> algTouching = new ArrayList<>();
        ArrayList<Country> sAfricaTouching = new ArrayList<>();
        ArrayList<Country> nKoreaTouching = new ArrayList<>();
        ArrayList<Country> sKoreaTouching = new ArrayList<>();
        ArrayList<Country> vietTouching = new ArrayList<>();
        ArrayList<Country> nigeriaTouching = new ArrayList<>();
        ArrayList<Country> argenTouching = new ArrayList<>();
        ArrayList<Country> austriaTouching = new ArrayList<>();
        ArrayList<Country> turkeyTouching = new ArrayList<>();
        ArrayList<Country> saudiTouching = new ArrayList<>();
        ArrayList<Country> pakTouching = new ArrayList<>();
        ArrayList<Country> indoTouching = new ArrayList<>();
        ArrayList<Country> swedenTouching = new ArrayList<>();
        ArrayList<Country> norwayTouching = new ArrayList<>();
        ArrayList<Country> finlandTouching = new ArrayList<>();
        ArrayList<Country> anarchyTouching = new ArrayList<>();

        ArrayList<Integer> uSAnger = new ArrayList<>();
        ArrayList<Integer> mexicoAnger = new ArrayList<>();
        ArrayList<Integer> canadaAnger = new ArrayList<>();
        ArrayList<Integer> eSAnger = new ArrayList<>();
        ArrayList<Integer> icelandAnger = new ArrayList<>();
        ArrayList<Integer> uKAnger = new ArrayList<>();
        ArrayList<Integer> frAnger = new ArrayList<>();
        ArrayList<Integer> germAnger = new ArrayList<>();
        ArrayList<Integer> russAnger = new ArrayList<>();
        ArrayList<Integer> polAnger = new ArrayList<>();
        ArrayList<Integer> japAnger = new ArrayList<>();
        ArrayList<Integer> chinAnger = new ArrayList<>();
        ArrayList<Integer> indAnger = new ArrayList<>();
        ArrayList<Integer> ukrAnger = new ArrayList<>();
        ArrayList<Integer> spainAnger = new ArrayList<>();
        ArrayList<Integer> iranAnger = new ArrayList<>();
        ArrayList<Integer> brAnger = new ArrayList<>();
        ArrayList<Integer> egyAnger = new ArrayList<>();
        ArrayList<Integer> australiaAnger = new ArrayList<>();
        ArrayList<Integer> italyAnger = new ArrayList<>();
        ArrayList<Integer> algAnger = new ArrayList<>();
        ArrayList<Integer> sAfricaAnger = new ArrayList<>();
        ArrayList<Integer> nKoreaAnger = new ArrayList<>();
        ArrayList<Integer> sKoreaAnger = new ArrayList<>();
        ArrayList<Integer> vietAnger = new ArrayList<>();
        ArrayList<Integer> nigeriaAnger = new ArrayList<>();
        ArrayList<Integer> argenAnger = new ArrayList<>();
        ArrayList<Integer> austriaAnger = new ArrayList<>();
        ArrayList<Integer> turkeyAnger = new ArrayList<>();
        ArrayList<Integer> saudiAnger = new ArrayList<>();
        ArrayList<Integer> pakAnger = new ArrayList<>();
        ArrayList<Integer> indoAnger = new ArrayList<>();
        ArrayList<Integer> swedenAnger = new ArrayList<>();
        ArrayList<Integer> finlandAnger = new ArrayList<>();
        ArrayList<Integer> norwayAnger = new ArrayList<>();
        ArrayList<Integer> anarchyAnger = new ArrayList<>();

        ArrayList<Region> usRegions = new ArrayList<>();
        ArrayList<Region> canadaRegions = new ArrayList<>();
        ArrayList<Region> mexicoRegions = new ArrayList<>();
        ArrayList<Region> eSRegions = new ArrayList<>();
        ArrayList<Region> icelandRegions = new ArrayList<>();
        ArrayList<Region> uKRegions = new ArrayList<>();
        ArrayList<Region> frRegions = new ArrayList<>();
        ArrayList<Region> germRegions = new ArrayList<>();
        ArrayList<Region> russRegions = new ArrayList<>();
        ArrayList<Region> polRegions = new ArrayList<>();
        ArrayList<Region> japRegions = new ArrayList<>();
        ArrayList<Region> chinRegions = new ArrayList<>();
        ArrayList<Region> indRegions = new ArrayList<>();
        ArrayList<Region> ukrRegions = new ArrayList<>();
        ArrayList<Region> spainRegions = new ArrayList<>();
        ArrayList<Region> iranRegions = new ArrayList<>();
        ArrayList<Region> brRegions = new ArrayList<>();
        ArrayList<Region> egyRegions = new ArrayList<>();
        ArrayList<Region> australiaRegions = new ArrayList<>();
        ArrayList<Region> italyRegions = new ArrayList<>();
        ArrayList<Region> algRegions = new ArrayList<>();
        ArrayList<Region> sAfricaRegions = new ArrayList<>();
        ArrayList<Region> nKoreaRegions = new ArrayList<>();
        ArrayList<Region> sKoreaRegions = new ArrayList<>();
        ArrayList<Region> vietRegions = new ArrayList<>();
        ArrayList<Region> nigeriaRegions = new ArrayList<>();
        ArrayList<Region> argenRegions = new ArrayList<>();
        ArrayList<Region> austriaRegions = new ArrayList<>();
        ArrayList<Region> turkeyRegions = new ArrayList<>();
        ArrayList<Region> saudiRegions = new ArrayList<>();
        ArrayList<Region> pakRegions = new ArrayList<>();
        ArrayList<Region> indoRegions = new ArrayList<>();
        ArrayList<Region> swedenRegions = new ArrayList<>();
        ArrayList<Region> finlandRegions = new ArrayList<>();
        ArrayList<Region> norwayRegions = new ArrayList<>();
        ArrayList<Region> anarchyRegions = new ArrayList<>();

        ArrayList<Integer> uSGroup = new ArrayList<>();
        ArrayList<Integer> mexGroup = new ArrayList<>();
        ArrayList<Integer> canGroup = new ArrayList<>();
        ArrayList<Integer> eSGroup = new ArrayList<>();
        ArrayList<Integer> iceGroup = new ArrayList<>();
        ArrayList<Integer> uKGroup = new ArrayList<>();
        ArrayList<Integer> frGroup = new ArrayList<>();
        ArrayList<Integer> germGroup = new ArrayList<>();
        ArrayList<Integer> russGroup = new ArrayList<>();
        ArrayList<Integer> polGroup = new ArrayList<>();
        ArrayList<Integer> japGroup = new ArrayList<>();
        ArrayList<Integer> chinGroup = new ArrayList<>();
        ArrayList<Integer> indGroup = new ArrayList<>();
        ArrayList<Integer> ukrGroup = new ArrayList<>();
        ArrayList<Integer> spainGroup = new ArrayList<>();
        ArrayList<Integer> iranGroup = new ArrayList<>();
        ArrayList<Integer> brGroup = new ArrayList<>();
        ArrayList<Integer> egyGroup = new ArrayList<>();
        ArrayList<Integer> australiaGroup = new ArrayList<>();
        ArrayList<Integer> italyGroup = new ArrayList<>();
        ArrayList<Integer> algGroup = new ArrayList<>();
        ArrayList<Integer> sAfricaGroup = new ArrayList<>();
        ArrayList<Integer> nKoreaGroup = new ArrayList<>();
        ArrayList<Integer> sKoreaGroup = new ArrayList<>();
        ArrayList<Integer> vietGroup = new ArrayList<>();
        ArrayList<Integer> nigeriaGroup = new ArrayList<>();
        ArrayList<Integer> argenGroup = new ArrayList<>();
        ArrayList<Integer> austriaGroup = new ArrayList<>();
        ArrayList<Integer> turkeyGroup = new ArrayList<>();
        ArrayList<Integer> saudiGroup = new ArrayList<>();
        ArrayList<Integer> pakGroup = new ArrayList<>();
        ArrayList<Integer> indoGroup = new ArrayList<>();
        ArrayList<Integer> swedenGroup = new ArrayList<>();
        ArrayList<Integer> finlandGroup = new ArrayList<>();
        ArrayList<Integer> norwayGroup = new ArrayList<>();
        ArrayList<Integer> anarchyGroup = new ArrayList<>();

//Groups
        uSGroup.add(english);
        uSGroup.add(colonies);
        //uSGroup.add(western);
        uSGroup.add(allies);
        uSGroup.add(arctic);
        uSGroup.add(northAmerican);

        mexGroup.add(axis);
        mexGroup.add(brics);
        //mexGroup.add(western);
        mexGroup.add(spanish);
        mexGroup.add(colonies);
        mexGroup.add(northAmerican);

        canGroup.add(arctic);
        canGroup.add(allies);
        canGroup.add(english);
        canGroup.add(french);
        //canGroup.add(western);
        canGroup.add(colonies);
        canGroup.add(northAmerican);

        eSGroup.add(spanish);
        //eSGroup.add(western);
        eSGroup.add(colonies);
        eSGroup.add(northAmerican);

        iceGroup.add(arctic);
        //iceGroup.add(western);
        iceGroup.add(colonies);
        iceGroup.add(european);

        uKGroup.add(allies);
        uKGroup.add(english);
        //uKGroup.add(western);
        uKGroup.add(european);

        frGroup.add(allies);
        frGroup.add(french);
        //frGroup.add(western);
        frGroup.add(european);

        germGroup.add(axis);
        //germGroup.add(western);
        germGroup.add(soviets);
        germGroup.add(european);

        russGroup.add(arctic);
        russGroup.add(allies);
        russGroup.add(soviets);
        russGroup.add(orthodox);
        russGroup.add(eastern);
        russGroup.add(brics);
        russGroup.add(european);
        russGroup.add(mongol);

        polGroup.add(orthodox);
        polGroup.add(european);
        //polGroup.add(western);
        polGroup.add(soviets);

        japGroup.add(axis);
        japGroup.add(mongol);

        chinGroup.add(eastern);
        chinGroup.add(brics);
        chinGroup.add(colonies);
        chinGroup.add(mongol);

        indGroup.add(brics);
        indGroup.add(asean);
        indGroup.add(colonies);

        ukrGroup.add(orthodox);
        ukrGroup.add(mongol);
        ukrGroup.add(european);
        ukrGroup.add(soviets);

        spainGroup.add(axis);
        spainGroup.add(spanish);
        //spainGroup.add(western);

        iranGroup.add(soviets);
        iranGroup.add(muslim);
        iranGroup.add(colonies);

        brGroup.add(southAmerican);
        //brGroup.add(western);
        brGroup.add(brics);
        brGroup.add(colonies);

        egyGroup.add(muslim);
        //egyGroup.add(western);
        egyGroup.add(colonies);

        australiaGroup.add(allies);
        australiaGroup.add(english);
        //australiaGroup.add(western);
        australiaGroup.add(colonies);

        italyGroup.add(axis);
        italyGroup.add(european);

        algGroup.add(muslim);
        algGroup.add(african);
        algGroup.add(french);
        algGroup.add(colonies);

        sAfricaGroup.add(african);
        sAfricaGroup.add(english);
        //sAfricaGroup.add(western);
        sAfricaGroup.add(brics);
        sAfricaGroup.add(colonies);

        nKoreaGroup.add(soviets);
        nKoreaGroup.add(eastern);
        nKoreaGroup.add(mongol);
        nKoreaGroup.add(colonies);

        sKoreaGroup.add(mongol);
        sKoreaGroup.add(colonies);

        vietGroup.add(soviets);
        vietGroup.add(eastern);
        vietGroup.add(asean);
        vietGroup.add(colonies);
        vietGroup.add(mongol);

        nigeriaGroup.add(african);
        nigeriaGroup.add(english);
        nigeriaGroup.add(colonies);

        argenGroup.add(southAmerican);
        argenGroup.add(spanish);
        //argenGroup.add(western);
        argenGroup.add(colonies);

        austriaGroup.add(axis);
        austriaGroup.add(soviets);
        //austriaGroup.add(western);
        austriaGroup.add(european);

        turkeyGroup.add(soviets);
        turkeyGroup.add(muslim);
        turkeyGroup.add(mongol);

        saudiGroup.add(opec);
        saudiGroup.add(brics);
        saudiGroup.add(muslim);

        pakGroup.add(muslim);
        pakGroup.add(soviets);
        pakGroup.add(colonies);

        indoGroup.add(french);
        indoGroup.add(muslim);
        indoGroup.add(asean);
        indoGroup.add(colonies);

        finlandGroup.add(european);
        finlandGroup.add(arctic);
        finlandGroup.add(soviets);
        finlandGroup.add(mongol);
        finlandGroup.add(axis);

        swedenGroup.add(arctic);
        swedenGroup.add(european);

        norwayGroup.add(arctic);
        norwayGroup.add(european);

        anarchyGroup.add(colonies);


        Country uS = new Country("United States", uSTouching, uSAnger, usRegions, uSGroup, new ArrayList<>(), new ArrayList<>());
        Country mexico = new Country("Mexico", mexicoTouching, mexicoAnger, mexicoRegions, mexGroup, new ArrayList<>(), new ArrayList<>());
        Country canada = new Country("Canada", canadaTouching, canadaAnger, canadaRegions, canGroup, new ArrayList<>(), new ArrayList<>());
        Country eS = new Country("El Salvador", eSTouching, eSAnger, eSRegions, eSGroup, new ArrayList<>(), new ArrayList<>());
        Country iceland = new Country("Iceland", icelandTouching, icelandAnger, icelandRegions, iceGroup, new ArrayList<>(), new ArrayList<>());
        Country uK = new Country("United Kingdom", uKTouching, uKAnger, uKRegions, uKGroup, new ArrayList<>(), new ArrayList<>());
        Country fr = new Country("France", frTouching, frAnger, frRegions, frGroup, new ArrayList<>(), new ArrayList<>());
        Country germ = new Country("Germany", germTouching, germAnger, germRegions, germGroup, new ArrayList<>(), new ArrayList<>());
        Country russ = new Country("Russia", russTouching, russAnger, russRegions, russGroup, new ArrayList<>(), new ArrayList<>());
        Country pol = new Country("Poland", polTouching, polAnger, polRegions, polGroup, new ArrayList<>(), new ArrayList<>());
        Country jap = new Country("Japan", japTouching, japAnger, japRegions, japGroup, new ArrayList<>(), new ArrayList<>());
        Country chin = new Country("China", chinTouching, chinAnger, chinRegions, chinGroup, new ArrayList<>(), new ArrayList<>());
        Country ind = new Country("India", indTouching, indAnger, indRegions, indGroup, new ArrayList<>(), new ArrayList<>());
        Country ukr = new Country("Ukraine", ukrTouching, ukrAnger, ukrRegions, ukrGroup, new ArrayList<>(), new ArrayList<>());
        Country spain = new Country("Spain", spainTouching, spainAnger, spainRegions, spainGroup, new ArrayList<>(), new ArrayList<>());
        Country iran = new Country("Iran", iranTouching, iranAnger, iranRegions, iranGroup, new ArrayList<>(), new ArrayList<>());
        Country br = new Country("Brazil", brTouching, brAnger, brRegions, brGroup, new ArrayList<>(), new ArrayList<>());
        Country egy = new Country("Egypt", egyTouching, egyAnger, egyRegions, egyGroup, new ArrayList<>(), new ArrayList<>());
        Country australia = new Country("Australia", australiaTouching, australiaAnger, australiaRegions, australiaGroup, new ArrayList<>(), new ArrayList<>());
        Country italy = new Country("Italy", italyTouching, italyAnger, italyRegions, italyGroup, new ArrayList<>(), new ArrayList<>());
        Country alg = new Country("Algeria", algTouching, algAnger, algRegions, algGroup, new ArrayList<>(), new ArrayList<>());
        Country sAfrica = new Country("South Africa", sAfricaTouching, sAfricaAnger, sAfricaRegions, sAfricaGroup, new ArrayList<>(), new ArrayList<>());
        Country nKorea = new Country("North Korea", nKoreaTouching, nKoreaAnger, nKoreaRegions, nKoreaGroup, new ArrayList<>(), new ArrayList<>());
        Country sKorea = new Country("South Korea", sKoreaTouching, sKoreaAnger, sKoreaRegions, sKoreaGroup, new ArrayList<>(), new ArrayList<>());
        Country viet = new Country("Vietnam", vietTouching, vietAnger, vietRegions, vietGroup, new ArrayList<>(), new ArrayList<>());
        Country nigeria = new Country("Nigeria", nigeriaTouching, nigeriaAnger, nigeriaRegions, nigeriaGroup, new ArrayList<>(), new ArrayList<>());
        Country argen = new Country("Argentina", argenTouching, argenAnger, argenRegions, argenGroup, new ArrayList<>(), new ArrayList<>());
        Country austria = new Country("Austria", austriaTouching, austriaAnger, austriaRegions, austriaGroup, new ArrayList<>(), new ArrayList<>());
        Country turkey = new Country("Turkey", turkeyTouching, turkeyAnger, turkeyRegions, turkeyGroup, new ArrayList<>(), new ArrayList<>());
        Country saudi = new Country("Saudi Arabia", saudiTouching, saudiAnger, saudiRegions, saudiGroup, new ArrayList<>(), new ArrayList<>());
        Country pak = new Country("Pakistan", pakTouching, pakAnger, pakRegions, pakGroup, new ArrayList<>(), new ArrayList<>());
        Country indo = new Country("Indonesia", indoTouching, indoAnger, indoRegions, indoGroup, new ArrayList<>(), new ArrayList<>());
        Country sweden = new Country("Sweden", swedenTouching, swedenAnger, swedenRegions, swedenGroup, new ArrayList<>(), new ArrayList<>());
        Country norway = new Country("Norway", norwayTouching, norwayAnger, norwayRegions, norwayGroup, new ArrayList<>(), new ArrayList<>());
        Country finland = new Country("Finland", finlandTouching, finlandAnger, finlandRegions, finlandGroup, new ArrayList<>(), new ArrayList<>());


        Country anarchy = new Country("Anarchy", anarchyTouching, anarchyAnger, anarchyRegions, anarchyGroup, new ArrayList<>(), new ArrayList<>());

//Regions
        ArrayList<Region> midwestTouching = new ArrayList<>();
        ArrayList<Region> northeastTouching = new ArrayList<>();
        ArrayList<Region> southTouching = new ArrayList<>();
        ArrayList<Region> westTouching = new ArrayList<>();
        ArrayList<Region> westCoastTouching = new ArrayList<>();
        ArrayList<Region> alaskaTouching = new ArrayList<>();
        ArrayList<Region> quebecTouching = new ArrayList<>();
        ArrayList<Region> albertaTouching = new ArrayList<>();
        ArrayList<Region> northernCanadaTouching = new ArrayList<>();
        ArrayList<Region> veraCruzTouching = new ArrayList<>();
        ArrayList<Region> nuevoTouching = new ArrayList<>();
        ArrayList<Region> yucatanTouching = new ArrayList<>();
        ArrayList<Region> sanoraTouching = new ArrayList<>();
        ArrayList<Region> elSalvadorTouching = new ArrayList<>();
        ArrayList<Region> icelandRegionTouching = new ArrayList<>();
        ArrayList<Region> englandTouching = new ArrayList<>();
        ArrayList<Region> scotlandTouching = new ArrayList<>();
        ArrayList<Region> irelandTouching = new ArrayList<>();
        ArrayList<Region> grandEstTouching = new ArrayList<>();
        ArrayList<Region> normandyTouching = new ArrayList<>();
        ArrayList<Region> aquitaineTouching = new ArrayList<>();
        ArrayList<Region> ameriSektTouching = new ArrayList<>();
        ArrayList<Region> britSektTouching = new ArrayList<>();
        ArrayList<Region> franzSektTouching = new ArrayList<>();
        ArrayList<Region> sowjSektTouching = new ArrayList<>();
        ArrayList<Region> polandRegionTouching = new ArrayList<>();
        ArrayList<Region> muscovyTouching = new ArrayList<>();
        ArrayList<Region> leningradTouching = new ArrayList<>();
        ArrayList<Region> volgogradTouching = new ArrayList<>();
        ArrayList<Region> volgaTouching = new ArrayList<>();
        ArrayList<Region> uralTouching = new ArrayList<>();
        ArrayList<Region> siberiaTouching = new ArrayList<>();
        ArrayList<Region> yakutiaTouching = new ArrayList<>();
        ArrayList<Region> hokkaidoTouching = new ArrayList<>();
        ArrayList<Region> kantoTouching = new ArrayList<>();
        ArrayList<Region> chubuTouching = new ArrayList<>();
        ArrayList<Region> chugokuTouching = new ArrayList<>();
        ArrayList<Region> beijingTouching = new ArrayList<>();
        ArrayList<Region> shanghaiTouching = new ArrayList<>();
        ArrayList<Region> wuhanTouching = new ArrayList<>();
        ArrayList<Region> tibetTouching = new ArrayList<>();
        ArrayList<Region> xinjiangTouching = new ArrayList<>();
        ArrayList<Region> guongzhouTouching = new ArrayList<>();
        ArrayList<Region> manchuriaTouching = new ArrayList<>();
        ArrayList<Region> punjabTouching = new ArrayList<>();
        ArrayList<Region> bengalTouching = new ArrayList<>();
        ArrayList<Region> karnatakaTouching = new ArrayList<>();
        ArrayList<Region> kyivTouching = new ArrayList<>();
        ArrayList<Region> donbassTouching = new ArrayList<>();
        ArrayList<Region> crimeaTouching = new ArrayList<>();
        ArrayList<Region> spainRegionTouching = new ArrayList<>();
        ArrayList<Region> kurdistanTouching = new ArrayList<>();
        ArrayList<Region> mazadaranTouching = new ArrayList<>();
        ArrayList<Region> khorasanTouching = new ArrayList<>();
        ArrayList<Region> amazonasTouching = new ArrayList<>();
        ArrayList<Region> saoPauloTouching = new ArrayList<>();
        ArrayList<Region> pernanbucoTouching = new ArrayList<>();
        ArrayList<Region> mattoGrassoTouching = new ArrayList<>();
        ArrayList<Region> cairoTouching = new ArrayList<>();
        ArrayList<Region> outerEgyptTouching = new ArrayList<>();
        ArrayList<Region> westAustraliaTouching = new ArrayList<>();
        ArrayList<Region> eastAustraliaTouching = new ArrayList<>();
        ArrayList<Region> lombardyTouching = new ArrayList<>();
        ArrayList<Region> romeTouching = new ArrayList<>();
        ArrayList<Region> naplesTouching = new ArrayList<>();
        ArrayList<Region> algeriaTouching = new ArrayList<>();
        ArrayList<Region> capeTouching = new ArrayList<>();
        ArrayList<Region> transvaalTouching = new ArrayList<>();
        ArrayList<Region> northKoreaTouching = new ArrayList<>();
        ArrayList<Region> southKoreaTouching = new ArrayList<>();
        ArrayList<Region> vietnamTouching = new ArrayList<>();
        ArrayList<Region> nigeriaRegionTouching = new ArrayList<>();
        ArrayList<Region> mesopotamiaTouching = new ArrayList<>();
        ArrayList<Region> patagoniaTouching = new ArrayList<>();
        ArrayList<Region> austriaRegionTouching = new ArrayList<>();
        ArrayList<Region> marmaraTouching = new ArrayList<>();
        ArrayList<Region> anatoliaTouching = new ArrayList<>();
        ArrayList<Region> riyadhTouching = new ArrayList<>();
        ArrayList<Region> meccaTouching = new ArrayList<>();
        ArrayList<Region> sindhTouching = new ArrayList<>();
        ArrayList<Region> balachistanTouching = new ArrayList<>();
        ArrayList<Region> javaTouching = new ArrayList<>();
        ArrayList<Region> sumatraTouching = new ArrayList<>();
        ArrayList<Region> norwayRegionTouching = new ArrayList<>();
        ArrayList<Region> finlandRegionTouching = new ArrayList<>();
        ArrayList<Region> swedenRegionTouching = new ArrayList<>();

        Region midwest = new Region("Midwest", 250,midwestTouching,0,0);
        Region northeast = new Region("Northeast", 350, northeastTouching,0,0);
        Region south = new Region("Deep South", 300, southTouching,0,0);
        Region west = new Region("Free West", 200, 100, westTouching,0,0);
        Region westCoast = new Region("West Coast", 350, westCoastTouching,0,0);
        Region alaska = new Region("Alaska", 50, 200, alaskaTouching,0,0);
        uS.regions.add(midwest);
        uS.regions.add(northeast);
        uS.regions.add(south);
        uS.regions.add(west);
        uS.regions.add(westCoast);
        uS.regions.add(alaska);

        Region quebec = new Region("Quebec", 200, quebecTouching,0,0);
        Region alberta = new Region("Alberta", 200, 100, albertaTouching,0,0);
        Region northernCanada = new Region("Northwest Territories", 50, 100, northernCanadaTouching,0,0);
        canada.regions.add(quebec);
        canada.regions.add(alberta);
        canada.regions.add(northernCanada);

        Region yucatan = new Region("Yucatan", 150, yucatanTouching,0,0);
        Region veraCruz = new Region("Vera Cruz", 200, veraCruzTouching,0,0);
        Region sanora = new Region("Sanora", 75, 50, sanoraTouching,0,0);
        Region nuevoLeon = new Region("Nuevo Leon", 75,  nuevoTouching,0,0);
        mexico.regions.add(yucatan);
        mexico.regions.add(veraCruz);
        mexico.regions.add(sanora);
        mexico.regions.add(nuevoLeon);

        Region elSalvador = new Region("El Salvador", 50, elSalvadorTouching,0,0);
        eS.regions.add(elSalvador);

        Region icelandRegion = new Region("Iceland", 50, 50, icelandRegionTouching,0,0);
        iceland.regions.add(icelandRegion);

        Region england = new Region("England", 400, englandTouching,0,0);
        Region scotland = new Region("Scotland", 200, scotlandTouching,0,0);
        Region ireland = new Region("Ireland", 200, irelandTouching,0,0);
        uK.regions.add(england);
        uK.regions.add(scotland);
        uK.regions.add(ireland);

        Region grandEst = new Region("Grand Est", 250, grandEstTouching,0,0);
        Region normandy = new Region("Normandy", 250, normandyTouching,0,0);
        Region aquitaine = new Region("Aquitaine", 250, aquitaineTouching,0,0);
        fr.regions.add(grandEst);
        fr.regions.add(normandy);
        fr.regions.add(aquitaine);

        Region ameriSekt = new Region("Amerikanischer Sektor", 300, ameriSektTouching,0,0);
        Region britSekt = new Region("Britischer Sektor", 400, britSektTouching,0,0);
        Region franzSekt = new Region("Franzözischer Sektor", 200, franzSektTouching,0,0);
        Region sowjSekt = new Region("Sowjet Sektor", 100, sowjSektTouching,0,0);
        germ.regions.add(ameriSekt);
        germ.regions.add(britSekt);
        germ.regions.add(franzSekt);
        germ.regions.add(sowjSekt);

        Region yakutia = new Region("Yakutia", 50, 200, yakutiaTouching,0,0);
        Region siberia = new Region("Siberia", 50, 200, siberiaTouching,0,0);
        Region ural = new Region("Ural", 50, 250, uralTouching,0,0);
        Region volga = new Region("Volga", 200, volgaTouching,0,0);
        Region muscovy = new Region("Muscovy", 350, muscovyTouching,0,0);
        Region leningrad = new Region("Leningrad", 350, 50, leningradTouching,0,0);
        Region volgograd = new Region("Volgograd", 300, volgogradTouching,0,0);
        russ.regions.add(yakutia);
        russ.regions.add(siberia);
        russ.regions.add(ural);
        russ.regions.add(volga);
        russ.regions.add(muscovy);
        russ.regions.add(leningrad);
        russ.regions.add(volgograd);

        Region polandRegion = new Region("Poland", 200, polandRegionTouching,0,0);
        pol.regions.add(polandRegion);

        Region hokkaido = new Region("Hokkaido", 100, hokkaidoTouching,0,0);
        Region kanto = new Region("Kanto", 200, kantoTouching,0,0);
        Region chubu = new Region("Chubu", 100, chubuTouching,0,0);
        Region chugoku = new Region("Chugoku", 100, chugokuTouching,0,0);
        jap.regions.add(hokkaido);
        jap.regions.add(kanto);
        jap.regions.add(chubu);
        jap.regions.add(chugoku);

        Region beijing = new Region("District of Beijing", 300, beijingTouching,0,0);
        Region tibet = new Region("Tibet", 50, 200, tibetTouching,0,0);
        Region xinjiang = new Region("Xinjiang", 50, 50, xinjiangTouching,0,0);
        Region shanghai = new Region("District of Shanghai", 250, shanghaiTouching,0,0);
        Region wuhan = new Region("District of Wuhan", 200, wuhanTouching,0,0);
        Region guongzhou = new Region("District of Guongzhou", 250, guongzhouTouching,0,0);
        Region manchuria = new Region("Manchuria", 150, manchuriaTouching,0,0);
        chin.regions.add(beijing);
        chin.regions.add(tibet);
        chin.regions.add(xinjiang);
        chin.regions.add(shanghai);
        chin.regions.add(wuhan);
        chin.regions.add(guongzhou);
        chin.regions.add(manchuria);

        Region punjab = new Region("Punjab", 150, punjabTouching,0,0);
        Region bengal = new Region("Bengal", 200, bengalTouching,0,0);
        Region karnataka = new Region("Karnataka", 200, karnatakaTouching,0,0);
        ind.regions.add(punjab);
        ind.regions.add(bengal);
        ind.regions.add(karnataka);

        Region donbass = new Region("Donbass", 25, donbassTouching,0,0);
        Region crimea = new Region("Crimea", 25, crimeaTouching,0,0);
        Region kyiv = new Region("Kyiv", 150, kyivTouching,0,0);
        ukr.regions.add(donbass);
        ukr.regions.add(crimea);
        ukr.regions.add(kyiv);

        Region spainRegion = new Region("Spain", 200, spainRegionTouching,0,0);
        spain.regions.add(spainRegion);

        Region kurdistan = new Region("Kurdistan", 150, 100, kurdistanTouching,0,0);
        Region mazadaran = new Region("Mazadaran", 250, mazadaranTouching,0,0);
        Region khorasan = new Region("Khorasan", 50, 100, khorasanTouching,0,0);
        iran.regions.add(kurdistan);
        iran.regions.add(mazadaran);
        iran.regions.add(khorasan);

        Region amazonas = new Region("Amazonas", 25, 25, amazonasTouching,0,0);
        Region mattoGrasso = new Region("Matto Grasso", 25, mattoGrassoTouching,0,0);
        Region saoPaulo = new Region("Sao Paulo", 150, saoPauloTouching,0,0);
        Region pernanbuco = new Region("Pernanbuco", 100, pernanbucoTouching,0,0);
        br.regions.add(amazonas);
        br.regions.add(mattoGrasso);
        br.regions.add(saoPaulo);
        br.regions.add(pernanbuco);

        Region cairo = new Region("Cairo", 150, cairoTouching,0,0);
        Region outerEgypt = new Region("Outer Egypt", 25, 50, outerEgyptTouching,0,0);
        egy.regions.add(cairo);
        egy.regions.add(outerEgypt);

        Region westAustralia = new Region("Western Australia", 25, 50, westAustraliaTouching,0,0);
        Region eastAustralia = new Region("Eastern Australia", 150, eastAustraliaTouching,0,0);
        australia.regions.add(westAustralia);
        australia.regions.add(eastAustralia);

        Region lombardy = new Region("Lombardy", 125, lombardyTouching,0,0);
        Region rome = new Region("Rome", 175, romeTouching,0,0);
        Region naples = new Region("Naples", 125, naplesTouching,0,0);
        italy.regions.add(lombardy);
        italy.regions.add(rome);
        italy.regions.add(naples);

        Region algeria = new Region("Algeria", 75, algeriaTouching,0,0);
        alg.regions.add(algeria);

        Region cape = new Region("The Cape", 50, capeTouching,0,0);
        Region transvaal = new Region("Transvaal", 150, transvaalTouching,0,0);
        sAfrica.regions.add(cape);
        sAfrica.regions.add(transvaal);

        Region northKorea = new Region("North Korea", 200, northKoreaTouching,0,0);
        nKorea.regions.add(northKorea);

        Region southKorea = new Region("South Korea", 300, southKoreaTouching,0,0);
        sKorea.regions.add(southKorea);

        Region vietnam = new Region("Vietnam", 50, vietnamTouching,0,0);
        viet.regions.add(vietnam);

        Region nigeriaRegion = new Region("Nigeria", 200, nigeriaRegionTouching,0,0);
        nigeria.regions.add(nigeriaRegion);

        Region mesopotamia = new Region("Mesopotamia", 150, mesopotamiaTouching,0,0);
        Region patagonia = new Region("Patagonia", 50, patagoniaTouching,0,0);
        argen.regions.add(mesopotamia);
        argen.regions.add(patagonia);

        Region austriaRegion = new Region("Austria", 200, austriaRegionTouching,0,0);
        austria.regions.add(austriaRegion);

        Region marmara = new Region("Marmara", 200, 50, marmaraTouching,0,0);
        Region anatolia = new Region("Anatolia", 100, 50, anatoliaTouching,0,0);
        turkey.regions.add(marmara);
        turkey.regions.add(anatolia);

        Region riyadh = new Region("Riyadh", 200, 75, riyadhTouching,0,0);
        Region mecca = new Region("Mecca", 200, 75, meccaTouching,0,0);
        saudi.regions.add(riyadh);
        saudi.regions.add(mecca);

        Region sindh = new Region("Sindh", 200, sindhTouching,0,0);
        Region balachistan = new Region("Balachistan", 200, balachistanTouching,0,0);
        pak.regions.add(balachistan);
        pak.regions.add(sindh);

        Region java = new Region("Java", 200, javaTouching,0,0);
        Region sumatra = new Region("Sumatra", 100, sumatraTouching,0,0);
        indo.regions.add(sumatra);
        indo.regions.add(java);

        Region finlandRegion = new Region("Finland", 75, 50, finlandRegionTouching,0,0);
        finland.regions.add(finlandRegion);

        Region swedenRegion = new Region("Sweden", 200, swedenRegionTouching,0,0);
        sweden.regions.add(swedenRegion);

        Region norwayRegion = new Region("Norway", 75, 150, norwayRegionTouching,0,0);
        norway.regions.add(norwayRegion);

        for (Country x : Country.bigList) {
            int stren = 0;
            for (Region y : x.regions) {
                stren += y.strength;
            }
            x.strength = stren;
        }

//Big List
        Country.bigList.add(uS);
        Country.bigList.add(mexico);
        Country.bigList.add(canada);
        Country.bigList.add(eS);
        Country.bigList.add(iceland);
        Country.bigList.add(uK);
        Country.bigList.add(fr);
        Country.bigList.add(germ);
        Country.bigList.add(russ);
        Country.bigList.add(pol);
        Country.bigList.add(jap);
        Country.bigList.add(chin);
        Country.bigList.add(ind);
        Country.bigList.add(ukr);
        Country.bigList.add(spain);
        Country.bigList.add(iran);
        Country.bigList.add(br);
        Country.bigList.add(egy);
        Country.bigList.add(australia);
        Country.bigList.add(italy);
        Country.bigList.add(alg);
        Country.bigList.add(sAfrica);
        Country.bigList.add(nKorea);
        Country.bigList.add(sKorea);
        Country.bigList.add(viet);
        Country.bigList.add(nigeria);
        Country.bigList.add(argen);
        Country.bigList.add(austria);
        Country.bigList.add(turkey);
        Country.bigList.add(saudi);
        Country.bigList.add(pak);
        Country.bigList.add(indo);
        Country.bigList.add(norway);
        Country.bigList.add(sweden);
        Country.bigList.add(finland);

//Angers
        //Anger against the US
        uS.anger.add(0);
        mexico.anger.add(3);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(7);
        fr.anger.add(1);
        germ.anger.add(5);
        russ.anger.add(10);
        pol.anger.add(1);
        jap.anger.add(4);
        chin.anger.add(10);
        ind.anger.add(2);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(7);
        br.anger.add(1);
        egy.anger.add(2);
        australia.anger.add(1);
        italy.anger.add(3);
        alg.anger.add(6);
        sAfrica.anger.add(1);
        nKorea.anger.add(10);
        sKorea.anger.add(1);
        viet.anger.add(10);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(3);
        turkey.anger.add(3);
        saudi.anger.add(3);
        pak.anger.add(5);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Mexico
        uS.anger.add(3);
        mexico.anger.add(0);
        canada.anger.add(1);
        eS.anger.add(4);
        iceland.anger.add(1);
        uK.anger.add(2);
        fr.anger.add(2);
        germ.anger.add(1);
        russ.anger.add(1);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(2);
        ind.anger.add(2);
        ukr.anger.add(1);
        spain.anger.add(8);
        iran.anger.add(1);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(1);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger Against Canada
        uS.anger.add(1);
        mexico.anger.add(1);
        canada.anger.add(0);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(5);
        fr.anger.add(1);
        germ.anger.add(2);
        russ.anger.add(3);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(2);
        ind.anger.add(1);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(2);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(3);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against El Salvador
        uS.anger.add(1);
        mexico.anger.add(3);
        canada.anger.add(1);
        eS.anger.add(0);
        iceland.anger.add(1);
        uK.anger.add(2);
        fr.anger.add(2);
        germ.anger.add(1);
        russ.anger.add(1);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(1);
        ind.anger.add(1);
        ukr.anger.add(1);
        spain.anger.add(3);
        iran.anger.add(1);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(1);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Iceland
        uS.anger.add(1);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(0);
        uK.anger.add(1);
        fr.anger.add(1);
        germ.anger.add(1);
        russ.anger.add(1);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(1);
        ind.anger.add(1);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(1);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(1);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against The United Kingdom
        uS.anger.add(7);
        mexico.anger.add(2);
        canada.anger.add(5);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(0);
        fr.anger.add(10);
        germ.anger.add(6);
        russ.anger.add(7);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(2);
        ind.anger.add(8);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(5);
        br.anger.add(1);
        egy.anger.add(10);
        australia.anger.add(4);
        italy.anger.add(3);
        alg.anger.add(1);
        sAfrica.anger.add(4);
        nKorea.anger.add(10);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(6);
        argen.anger.add(7);
        austria.anger.add(3);
        turkey.anger.add(3);
        saudi.anger.add(1);
        pak.anger.add(3);
        indo.anger.add(3);
        norway.anger.add(3);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against France
        uS.anger.add(1);
        mexico.anger.add(2);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(8);
        fr.anger.add(0);
        germ.anger.add(10);
        russ.anger.add(5);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(2);
        ind.anger.add(1);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(2);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(3);
        alg.anger.add(4);
        sAfrica.anger.add(1);
        nKorea.anger.add(5);
        sKorea.anger.add(1);
        viet.anger.add(10);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(3);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(3);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Germany
        uS.anger.add(3);
        mexico.anger.add(1);
        canada.anger.add(2);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(6);
        fr.anger.add(8);
        germ.anger.add(0);
        russ.anger.add(3);
        pol.anger.add(7);
        jap.anger.add(1);
        chin.anger.add(3);
        ind.anger.add(1);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(1);
        br.anger.add(1);
        egy.anger.add(2);
        australia.anger.add(2);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(3);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(3);
        saudi.anger.add(1);
        pak.anger.add(3);
        indo.anger.add(1);
        norway.anger.add(5);
        sweden.anger.add(2);
        finland.anger.add(1);

        //Anger against Russia
        uS.anger.add(10);
        mexico.anger.add(1);
        canada.anger.add(2);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(8);
        fr.anger.add(8);
        germ.anger.add(4);
        russ.anger.add(0);
        pol.anger.add(7);
        jap.anger.add(5);
        chin.anger.add(1);
        ind.anger.add(5);
        ukr.anger.add(10);
        spain.anger.add(3);
        iran.anger.add(3);
        br.anger.add(1);
        egy.anger.add(2);
        australia.anger.add(3);
        italy.anger.add(3);
        alg.anger.add(1);
        sAfrica.anger.add(2);
        nKorea.anger.add(1);
        sKorea.anger.add(6);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(3);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(3);
        sweden.anger.add(5);
        finland.anger.add(10);

        //Anger against Poland
        uS.anger.add(1);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(1);
        fr.anger.add(1);
        germ.anger.add(7);
        russ.anger.add(7);
        pol.anger.add(0);
        jap.anger.add(1);
        chin.anger.add(1);
        ind.anger.add(1);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(2);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(2);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(5);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(6);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Japan
        uS.anger.add(1);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(1);
        fr.anger.add(1);
        germ.anger.add(1);
        russ.anger.add(5);
        pol.anger.add(1);
        jap.anger.add(0);
        chin.anger.add(10);
        ind.anger.add(1);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(1);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(2);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(10);
        sKorea.anger.add(3);
        viet.anger.add(5);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(2);
        indo.anger.add(5);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against China
        uS.anger.add(9);
        mexico.anger.add(3);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(5);
        fr.anger.add(5);
        germ.anger.add(7);
        russ.anger.add(1);
        pol.anger.add(3);
        jap.anger.add(10);
        chin.anger.add(0);
        ind.anger.add(10);
        ukr.anger.add(3);
        spain.anger.add(3);
        iran.anger.add(3);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(5);
        italy.anger.add(2);
        alg.anger.add(1);
        sAfrica.anger.add(2);
        nKorea.anger.add(1);
        sKorea.anger.add(8);
        viet.anger.add(3);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(3);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(3);
        indo.anger.add(4);
        norway.anger.add(2);
        sweden.anger.add(2);
        finland.anger.add(2);

        //Anger against India
        uS.anger.add(1);
        mexico.anger.add(4);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(6);
        fr.anger.add(1);
        germ.anger.add(1);
        russ.anger.add(2);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(7);
        ind.anger.add(0);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(10);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(3);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(6);
        sKorea.anger.add(1);
        viet.anger.add(3);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(6);
        pak.anger.add(10);
        indo.anger.add(5);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Ukraine
        uS.anger.add(1);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(1);
        fr.anger.add(1);
        germ.anger.add(2);
        russ.anger.add(10);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(3);
        ind.anger.add(1);
        ukr.anger.add(0);
        spain.anger.add(1);
        iran.anger.add(3);
        br.anger.add(1);
        egy.anger.add(2);
        australia.anger.add(1);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(5);
        sKorea.anger.add(1);
        viet.anger.add(2);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(3);
        turkey.anger.add(2);
        saudi.anger.add(2);
        pak.anger.add(4);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Spain
        uS.anger.add(1);
        mexico.anger.add(10);
        canada.anger.add(1);
        eS.anger.add(10);
        iceland.anger.add(1);
        uK.anger.add(2);
        fr.anger.add(4);
        germ.anger.add(1);
        russ.anger.add(2);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(1);
        ind.anger.add(1);
        ukr.anger.add(1);
        spain.anger.add(0);
        iran.anger.add(2);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(1);
        alg.anger.add(3);
        sAfrica.anger.add(1);
        nKorea.anger.add(4);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(4);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Iran
        uS.anger.add(5);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(2);
        fr.anger.add(2);
        germ.anger.add(1);
        russ.anger.add(5);
        pol.anger.add(2);
        jap.anger.add(1);
        chin.anger.add(2);
        ind.anger.add(10);
        ukr.anger.add(3);
        spain.anger.add(1);
        iran.anger.add(0);
        br.anger.add(2);
        egy.anger.add(3);
        australia.anger.add(2);
        italy.anger.add(3);
        alg.anger.add(3);
        sAfrica.anger.add(1);
        nKorea.anger.add(1);
        sKorea.anger.add(2);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(2);
        turkey.anger.add(2);
        saudi.anger.add(7);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(2);
        sweden.anger.add(2);
        finland.anger.add(2);

        //Anger against Brazil
        uS.anger.add(1);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(1);
        fr.anger.add(1);
        germ.anger.add(1);
        russ.anger.add(1);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(1);
        ind.anger.add(1);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(1);
        br.anger.add(0);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(1);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Egypt
        uS.anger.add(1);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(4);
        fr.anger.add(1);
        germ.anger.add(1);
        russ.anger.add(1);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(1);
        ind.anger.add(3);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(1);
        br.anger.add(1);
        egy.anger.add(0);
        australia.anger.add(1);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(1);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(2);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Australia
        uS.anger.add(1);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(4);
        fr.anger.add(1);
        germ.anger.add(2);
        russ.anger.add(7);
        pol.anger.add(1);
        jap.anger.add(3);
        chin.anger.add(7);
        ind.anger.add(4);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(2);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(0);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(8);
        sKorea.anger.add(1);
        viet.anger.add(4);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(2);
        indo.anger.add(8);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Italy
        uS.anger.add(2);
        mexico.anger.add(1);
        canada.anger.add(2);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(3);
        fr.anger.add(2);
        germ.anger.add(1);
        russ.anger.add(5);
        pol.anger.add(2);
        jap.anger.add(1);
        chin.anger.add(3);
        ind.anger.add(1);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(3);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(0);
        alg.anger.add(4);
        sAfrica.anger.add(1);
        nKorea.anger.add(5);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(2);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Algeria
        uS.anger.add(2);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(1);
        fr.anger.add(3);
        germ.anger.add(1);
        russ.anger.add(1);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(1);
        ind.anger.add(3);
        ukr.anger.add(1);
        spain.anger.add(3);
        iran.anger.add(2);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(4);
        alg.anger.add(0);
        sAfrica.anger.add(1);
        nKorea.anger.add(1);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(3);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against South Africa
        uS.anger.add(1);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(4);
        fr.anger.add(1);
        germ.anger.add(1);
        russ.anger.add(1);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(1);
        ind.anger.add(1);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(1);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(3);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against North Korea
        uS.anger.add(10);
        mexico.anger.add(3);
        canada.anger.add(5);
        eS.anger.add(3);
        iceland.anger.add(3);
        uK.anger.add(5);
        fr.anger.add(5);
        germ.anger.add(5);
        russ.anger.add(1);
        pol.anger.add(5);
        jap.anger.add(10);
        chin.anger.add(1);
        ind.anger.add(3);
        ukr.anger.add(5);
        spain.anger.add(5);
        iran.anger.add(3);
        br.anger.add(3);
        egy.anger.add(1);
        australia.anger.add(9);
        italy.anger.add(5);
        alg.anger.add(1);
        sAfrica.anger.add(3);
        nKorea.anger.add(0);
        sKorea.anger.add(10);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(3);
        austria.anger.add(5);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(7);
        norway.anger.add(2);
        sweden.anger.add(2);
        finland.anger.add(2);

        //Anger against South Korea
        uS.anger.add(1);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(1);
        fr.anger.add(1);
        germ.anger.add(1);
        russ.anger.add(10);
        pol.anger.add(1);
        jap.anger.add(2);
        chin.anger.add(10);
        ind.anger.add(1);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(3);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(10);
        sKorea.anger.add(0);
        viet.anger.add(3);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Vietnam
        uS.anger.add(6);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(1);
        fr.anger.add(6);
        germ.anger.add(1);
        russ.anger.add(1);
        pol.anger.add(2);
        jap.anger.add(5);
        chin.anger.add(3);
        ind.anger.add(4);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(1);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(3);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(1);
        sKorea.anger.add(4);
        viet.anger.add(0);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Nigeria
        uS.anger.add(1);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(5);
        fr.anger.add(1);
        germ.anger.add(1);
        russ.anger.add(1);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(1);
        ind.anger.add(1);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(2);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(3);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Argentina
        uS.anger.add(1);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(1);
        fr.anger.add(1);
        germ.anger.add(1);
        russ.anger.add(2);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(1);
        ind.anger.add(1);
        ukr.anger.add(1);
        spain.anger.add(6);
        iran.anger.add(2);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(3);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Austria
        uS.anger.add(3);
        mexico.anger.add(1);
        canada.anger.add(3);
        eS.anger.add(1);
        iceland.anger.add(2);
        uK.anger.add(3);
        fr.anger.add(3);
        germ.anger.add(1);
        russ.anger.add(7);
        pol.anger.add(6);
        jap.anger.add(1);
        chin.anger.add(5);
        ind.anger.add(1);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(2);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(2);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(5);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(0);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(4);
        sweden.anger.add(2);
        finland.anger.add(1);

        //Anger against Turkey
        uS.anger.add(1);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(4);
        fr.anger.add(1);
        germ.anger.add(1);
        russ.anger.add(1);
        pol.anger.add(2);
        jap.anger.add(1);
        chin.anger.add(1);
        ind.anger.add(4);
        ukr.anger.add(3);
        spain.anger.add(1);
        iran.anger.add(2);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(3);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(1);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Saudi Arabia
        uS.anger.add(1);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(4);
        fr.anger.add(1);
        germ.anger.add(1);
        russ.anger.add(3);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(1);
        ind.anger.add(5);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(3);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(2);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(4);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Pakistan
        uS.anger.add(4);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(2);
        fr.anger.add(2);
        germ.anger.add(1);
        russ.anger.add(4);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(2);
        ind.anger.add(10);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(1);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(2);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(1);
        sKorea.anger.add(3);
        viet.anger.add(1);
        nigeria.anger.add(2);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(0);
        indo.anger.add(1);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Indonesia
        uS.anger.add(1);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(1);
        fr.anger.add(1);
        germ.anger.add(1);
        russ.anger.add(3);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(4);
        ind.anger.add(7);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(1);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(5);
        sKorea.anger.add(1);
        viet.anger.add(2);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(0);
        norway.anger.add(1);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Norway
        uS.anger.add(1);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(3);
        fr.anger.add(1);
        germ.anger.add(3);
        russ.anger.add(3);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(2);
        ind.anger.add(1);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(1);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(2);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(2);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(2);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(0);
        sweden.anger.add(1);
        finland.anger.add(1);

        //Anger against Sweden
        uS.anger.add(1);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(3);
        fr.anger.add(3);
        germ.anger.add(1);
        russ.anger.add(3);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(2);
        ind.anger.add(1);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(2);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(2);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(2);
        sKorea.anger.add(1);
        viet.anger.add(1);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(3);
        sweden.anger.add(0);
        finland.anger.add(1);

        //Anger against Finland
        uS.anger.add(1);
        mexico.anger.add(1);
        canada.anger.add(1);
        eS.anger.add(1);
        iceland.anger.add(1);
        uK.anger.add(3);
        fr.anger.add(3);
        germ.anger.add(1);
        russ.anger.add(7);
        pol.anger.add(1);
        jap.anger.add(1);
        chin.anger.add(2);
        ind.anger.add(1);
        ukr.anger.add(1);
        spain.anger.add(1);
        iran.anger.add(2);
        br.anger.add(1);
        egy.anger.add(1);
        australia.anger.add(1);
        italy.anger.add(1);
        alg.anger.add(1);
        sAfrica.anger.add(1);
        nKorea.anger.add(3);
        sKorea.anger.add(1);
        viet.anger.add(2);
        nigeria.anger.add(1);
        argen.anger.add(1);
        austria.anger.add(1);
        turkey.anger.add(1);
        saudi.anger.add(1);
        pak.anger.add(1);
        indo.anger.add(1);
        norway.anger.add(3);
        sweden.anger.add(1);
        finland.anger.add(0);

//Region Touchings
        //Midwest
        northeast.touching.add(midwest);
        south.touching.add(midwest);
        west.touching.add(midwest);
        alberta.touching.add(midwest);

        //Northeast
        quebec.touching.add(northeast);
        south.touching.add(northeast);
        midwest.touching.add(northeast);

        //South
        northeast.touching.add(south);
        midwest.touching.add(south);
        west.touching.add(south);
        nuevoLeon.touching.add(south);

        //West
        midwest.touching.add(west);
        south.touching.add(west);
        westCoast.touching.add(west);
        alberta.touching.add(west);
        sanora.touching.add(west);

        //WestCoast
        west.touching.add(westCoast);
        alberta.touching.add(westCoast);
        sanora.touching.add(westCoast);

        //Alaska
        northernCanada.touching.add(alaska);
        yakutia.touching.add(alaska);

        //Quebec
        northeast.touching.add(quebec);
        alberta.touching.add(quebec);
        icelandRegion.touching.add(quebec);

        //Western Canada
        midwest.touching.add(alberta);
        quebec.touching.add(alberta);
        west.touching.add(alberta);
        westCoast.touching.add(alberta);
        northernCanada.touching.add(alberta);

        //Northern Canada
        alberta.touching.add(northernCanada);
        alaska.touching.add(northernCanada);

        //Nueva Leon
        south.touching.add(nuevoLeon);
        sanora.touching.add(nuevoLeon);
        veraCruz.touching.add(nuevoLeon);

        //Sanora
        west.touching.add(sanora);
        westCoast.touching.add(sanora);
        nuevoLeon.touching.add(sanora);

        //Vera Cruz
        nuevoLeon.touching.add(veraCruz);
        yucatan.touching.add(veraCruz);

        //Yucatan
        veraCruz.touching.add(yucatan);
        elSalvador.touching.add(yucatan);

        //El Salvador
        yucatan.touching.add(elSalvador);
        amazonas.touching.add(elSalvador);

        //Amazonas
        elSalvador.touching.add(amazonas);
        pernanbuco.touching.add(amazonas);
        mattoGrasso.touching.add(amazonas);

        //Matto Grasso
        pernanbuco.touching.add(mattoGrasso);
        amazonas.touching.add(mattoGrasso);
        saoPaulo.touching.add(mattoGrasso);

        //Sao Paulo
        pernanbuco.touching.add(saoPaulo);
        mattoGrasso.touching.add(saoPaulo);
        mesopotamia.touching.add(saoPaulo);

        //Pernanbuco
        mattoGrasso.touching.add(pernanbuco);
        amazonas.touching.add(pernanbuco);
        saoPaulo.touching.add(pernanbuco);

        //Mesopotamia
        saoPaulo.touching.add(mesopotamia);
        patagonia.touching.add(mesopotamia);

        //Patagonia
        mesopotamia.touching.add(patagonia);

        //Iceland
        quebec.touching.add(icelandRegion);
        scotland.touching.add(icelandRegion);
        ireland.touching.add(icelandRegion);
        norwayRegion.touching.add(icelandRegion);

        //Norway
        icelandRegion.touching.add(norwayRegion);
        scotland.touching.add(norwayRegion);
        swedenRegion.touching.add(norwayRegion);

        //Sweden
        norwayRegion.touching.add(swedenRegion);
        franzSekt.touching.add(swedenRegion);
        finlandRegion.touching.add(swedenRegion);

        //Finland
        swedenRegion.touching.add(finlandRegion);
        leningrad.touching.add(finlandRegion);

        //Scotland
        icelandRegion.touching.add(scotland);
        ireland.touching.add(scotland);
        england.touching.add(scotland);
        norwayRegion.touching.add(scotland);

        //Ireland
        icelandRegion.touching.add(ireland);
        scotland.touching.add(ireland);
        england.touching.add(ireland);

        //England
        scotland.touching.add(england);
        ireland.touching.add(england);
        normandy.touching.add(england);

        //Normandy
        grandEst.touching.add(normandy);
        aquitaine.touching.add(normandy);
        england.touching.add(normandy);

        //Aquitaine
        grandEst.touching.add(aquitaine);
        normandy.touching.add(aquitaine);
        spainRegion.touching.add(aquitaine);

        //Spain
        aquitaine.touching.add(spainRegion);
        algeria.touching.add(spainRegion);

        //Grand Est
        normandy.touching.add(grandEst);
        aquitaine.touching.add(grandEst);
        britSekt.touching.add(grandEst);
        ameriSekt.touching.add(grandEst);
        lombardy.touching.add(grandEst);

        //Lombardy
        grandEst.touching.add(lombardy);
        ameriSekt.touching.add(lombardy);
        rome.touching.add(lombardy);
        austriaRegion.touching.add(lombardy);

        //Rome
        lombardy.touching.add(rome);
        naples.touching.add(rome);

        //Naples
        rome.touching.add(naples);
        algeria.touching.add(naples);

        //Algeria
        naples.touching.add(algeria);
        outerEgypt.touching.add(algeria);
        spainRegion.touching.add(algeria);
        nigeriaRegion.touching.add(algeria);

        //Austria
        ameriSekt.touching.add(austriaRegion);
        lombardy.touching.add(austriaRegion);
        polandRegion.touching.add(austriaRegion);

        //Amerikan Sektor
        britSekt.touching.add(ameriSekt);
        sowjSekt.touching.add(ameriSekt);
        lombardy.touching.add(ameriSekt);
        austriaRegion.touching.add(ameriSekt);
        grandEst.touching.add(ameriSekt);

        //British Sektor
        franzSekt.touching.add(britSekt);
        ameriSekt.touching.add(britSekt);
        sowjSekt.touching.add(britSekt);
        grandEst.touching.add(britSekt);

        //French Sektor
        britSekt.touching.add(franzSekt);
        sowjSekt.touching.add(franzSekt);
        swedenRegion.touching.add(franzSekt);

        //Soviet Sektor
        britSekt.touching.add(sowjSekt);
        ameriSekt.touching.add(sowjSekt);
        franzSekt.touching.add(sowjSekt);
        polandRegion.touching.add(sowjSekt);

        //Poland Region
        sowjSekt.touching.add(polandRegion);
        muscovy.touching.add(polandRegion);
        austriaRegion.touching.add(polandRegion);
        kyiv.touching.add(polandRegion);

        //Donbass
        volgograd.touching.add(donbass);
        kyiv.touching.add(donbass);

        //Crimea
        volgograd.touching.add(crimea);
        kyiv.touching.add(crimea);
        marmara.touching.add(crimea);

        //Kyiv
        donbass.touching.add(kyiv);
        crimea.touching.add(kyiv);
        polandRegion.touching.add(kyiv);

        //Marmara
        crimea.touching.add(marmara);
        anatolia.touching.add(marmara);

        //Anatolia
        marmara.touching.add(anatolia);
        kurdistan.touching.add(anatolia);
        volgograd.touching.add(anatolia);
        riyadh.touching.add(anatolia);

        //Muscovy
        polandRegion.touching.add(muscovy);
        leningrad.touching.add(muscovy);
        volga.touching.add(muscovy);
        volgograd.touching.add(muscovy);

        //Leningrad
        muscovy.touching.add(leningrad);
        ural.touching.add(leningrad);
        finlandRegion.touching.add(leningrad);

        //Volgograd
        muscovy.touching.add(volgograd);
        volga.touching.add(volgograd);
        crimea.touching.add(volgograd);
        donbass.touching.add(volgograd);
        anatolia.touching.add(volgograd);
        kurdistan.touching.add(volgograd);

        //Volga
        muscovy.touching.add(volga);
        volgograd.touching.add(volga);
        ural.touching.add(volga);

        //Ural
        volga.touching.add(ural);
        leningrad.touching.add(ural);
        siberia.touching.add(ural);

        //Siberia
        ural.touching.add(siberia);
        yakutia.touching.add(siberia);
        xinjiang.touching.add(siberia);

        //Yakutia
        siberia.touching.add(yakutia);
        hokkaido.touching.add(yakutia);
        northKorea.touching.add(yakutia);
        manchuria.touching.add(yakutia);
        alaska.touching.add(yakutia);

        //Hokkaido
        yakutia.touching.add(hokkaido);
        kanto.touching.add(hokkaido);

        //Kanto
        hokkaido.touching.add(kanto);
        chubu.touching.add(kanto);

        //Chubu
        kanto.touching.add(chubu);
        chugoku.touching.add(chubu);

        //Chugoku
        chubu.touching.add(chugoku);
        shanghai.touching.add(chugoku);
        southKorea.touching.add(chugoku);

        //North Korea
        yakutia.touching.add(northKorea);
        manchuria.touching.add(northKorea);
        southKorea.touching.add(northKorea);

        //South Korea
        northKorea.touching.add(southKorea);
        shanghai.touching.add(southKorea);
        chugoku.touching.add(southKorea);

        //Beijing
        manchuria.touching.add(beijing);
        shanghai.touching.add(beijing);
        xinjiang.touching.add(beijing);
        wuhan.touching.add(beijing);

        //Manchuria
        beijing.touching.add(manchuria);
        yakutia.touching.add(manchuria);
        northKorea.touching.add(manchuria);
        shanghai.touching.add(manchuria);

        //Xinjiang
        beijing.touching.add(xinjiang);
        siberia.touching.add(xinjiang);
        tibet.touching.add(xinjiang);

        //Tibet
        xinjiang.touching.add(tibet);
        wuhan.touching.add(tibet);
        guongzhou.touching.add(tibet);
        bengal.touching.add(tibet);

        //Wuhan
        beijing.touching.add(wuhan);
        tibet.touching.add(wuhan);
        shanghai.touching.add(wuhan);
        guongzhou.touching.add(wuhan);

        //Guongzhou
        shanghai.touching.add(guongzhou);
        wuhan.touching.add(guongzhou);
        tibet.touching.add(guongzhou);
        vietnam.touching.add(guongzhou);

        //Shanghai
        wuhan.touching.add(shanghai);
        beijing.touching.add(shanghai);
        guongzhou.touching.add(shanghai);
        manchuria.touching.add(shanghai);
        chugoku.touching.add(shanghai);
        southKorea.touching.add(shanghai);

        //Punjab
        bengal.touching.add(punjab);
        karnataka.touching.add(punjab);
        sindh.touching.add(punjab);

        //Bengal
        punjab.touching.add(bengal);
        karnataka.touching.add(bengal);
        tibet.touching.add(bengal);
        vietnam.touching.add(bengal);

        //Karnataka
        punjab.touching.add(karnataka);
        bengal.touching.add(karnataka);

        //Sindh
        punjab.touching.add(sindh);
        balachistan.touching.add(sindh);

        //Balachistan
        sindh.touching.add(balachistan);
        khorasan.touching.add(balachistan);

        //Kurdistan
        volgograd.touching.add(kurdistan);
        mazadaran.touching.add(kurdistan);
        anatolia.touching.add(kurdistan);
        riyadh.touching.add(kurdistan);

        //Mazadaran
        kurdistan.touching.add(mazadaran);
        khorasan.touching.add(mazadaran);

        //Khorasan
        mazadaran.touching.add(khorasan);
        balachistan.touching.add(khorasan);

        //Riyadh
        kurdistan.touching.add(riyadh);
        anatolia.touching.add(riyadh);
        mecca.touching.add(riyadh);

        //Mecca
        riyadh.touching.add(mecca);
        outerEgypt.touching.add(mecca);

        //Cairo
        outerEgypt.touching.add(cairo);

        //Outer Egypt
        cairo.touching.add(outerEgypt);
        algeria.touching.add(outerEgypt);
        transvaal.touching.add(outerEgypt);
        mecca.touching.add(outerEgypt);

        //Transvaal
        cape.touching.add(transvaal);
        outerEgypt.touching.add(transvaal);

        //Cape
        transvaal.touching.add(cape);
        nigeriaRegion.touching.add(cape);

        //Nigeria
        cape.touching.add(nigeriaRegion);
        algeria.touching.add(nigeriaRegion);

        //Vietnam
        sumatra.touching.add(vietnam);
        guongzhou.touching.add(vietnam);
        bengal.touching.add(vietnam);

        //Sumatra
        vietnam.touching.add(sumatra);
        java.touching.add(sumatra);

        //Java
        sumatra.touching.add(java);
        westAustralia.touching.add(java);

        //East Australia
        westAustralia.touching.add(eastAustralia);

        //West Australia
        eastAustralia.touching.add(westAustralia);
        java.touching.add(westAustralia);

        for (Country x : Country.bigList) {
            for (Region y : x.regions) {
                for (Region z : y.touching) {
                    if (!z.touching.contains(y)) {
                        System.out.println("There is an error in the System: " + y + " borders " + z + ", but " + z + " doesn't border " + y);
                    }
                }
            }
        }



//Main
        /*for(Country x : Country.bigList){
            for(Region y : x.regions){
                System.out.println(y);
            }
        }*/

/*
        int[] hy = new int[21];
        for(Country x : Country.bigList){
            for(int i : x.groups){
                hy[i]++;
            }
        }
        for(int x : hy) {
            System.out.println(x);
        }
*/
        //new MapButton();
        String[] maps = {"World","Arctic","Europe","Mediterranean"};
        String map = DropDownMenu.getSelectedChoice(maps, "Choose a map to play");
        //String map = JOptionPane.showInputDialog("What map would you like to play?");
        JOptionPane.showMessageDialog(null, "You have chosen " + map);
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("What map would you like to play? You can choose from: World War 3, Asia, Europe, North America, South America, Africa, Indian Ocean, Mediterranean, Pacific, Atlantic, or Arctic");
        //map = scanner.nextLine();
        //scanner.nextLine();

        while(map == null){
            map = DropDownMenu.getSelectedChoice(maps, "Choose a map to play");
        }

        for(Country x : Country.bigList){
            x.allianceNames.add(x.name);
        }

        if (map.equals("Arctic")){
            map = "Arctic";
            for(int i = Country.bigList.size() - 1; i > -1; i--){
                Country x = Country.bigList.get(i);
                for(int j = x.regions.size() - 1; j > -1; j--){
                    Region y = Country.bigList.get(i).regions.get(j);
                    for(int k = y.touching.size() - 1; k > -1; k--) {
                        Region z = Country.bigList.get(i).regions.get(j).touching.get(k);
                        if (z != northernCanada && z != alaska && z != yakutia && z != siberia && z != ural && z != icelandRegion && z != quebec && z != alberta && z != leningrad && z != swedenRegion && z != finlandRegion && z != norwayRegion){
                            y.touching.remove(z);
                        }
                    }
                    if(y != northernCanada && y != alaska && y != yakutia && y != siberia && y != ural && y != icelandRegion && y != quebec && y != alberta && y != leningrad && y != swedenRegion && y != finlandRegion && y != norwayRegion){
                        x.regions.remove(y);
                    }
                }
                if(x.regions.size()==0){
                    for(Country y : Country.bigList) {
                        y.anger.remove(Country.bigList.indexOf(x));
                    }
                    Country.bigList.remove(x);
                }
            }
        }
        if (map.equals("Europe")){
            map = "Europe";
            for(int i = Country.bigList.size() - 1; i > -1; i--){
                Country x = Country.bigList.get(i);
                for(int j = x.regions.size() - 1; j > -1; j--){
                    Region y = Country.bigList.get(i).regions.get(j);
                    for(int k = y.touching.size() - 1; k > -1; k--) {
                        Region z = Country.bigList.get(i).regions.get(j).touching.get(k);
                        if (z != icelandRegion && z != england && z != ireland && z != scotland && z != aquitaine && z != grandEst && z != normandy && z != spainRegion && z != ameriSekt && z != franzSekt && z != finlandRegion && z != norwayRegion && z != britSekt && z != sowjSekt && z != austriaRegion && z != rome && z != naples && z != lombardy && z != polandRegion && z != kyiv && z != crimea && z != donbass && z != muscovy && z != leningrad && z != swedenRegion && z != volga){
                            y.touching.remove(z);
                        }
                    }
                    if(y != icelandRegion && y != england && y != ireland && y != scotland && y != aquitaine && y != grandEst && y != normandy && y != spainRegion && y != ameriSekt && y != franzSekt && y != finlandRegion && y != norwayRegion && y != britSekt && y != sowjSekt && y != austriaRegion && y != rome && y != naples && y != lombardy && y != polandRegion && y != kyiv && y != crimea && y != donbass && y != muscovy && y != leningrad && y != swedenRegion && y != volga){
                        x.regions.remove(y);
                    }
                }
                if(x.regions.size()==0){
                    Country.bigList.remove(x);
                    for(Country y : Country.bigList){
                        y.anger.remove(i);
                    }
                }
            }
        }
        if (map.equals("Mediterranean")){
            for(int i = Country.bigList.size() - 1; i > -1; i--){
                Country x = Country.bigList.get(i);
                for(int j = x.regions.size() - 1; j > -1; j--){
                    Region y = Country.bigList.get(i).regions.get(j);
                    for(int k = y.touching.size() - 1; k > -1; k--) {
                        Region z = Country.bigList.get(i).regions.get(j).touching.get(k);
                        if (z != aquitaine && z != spainRegion && z != cairo && z != outerEgypt && z != lombardy && z != rome && z != naples && z != algeria && z != marmara && z != anatolia){
                            y.touching.remove(z);
                        }
                    }
                    if(y != aquitaine && y != spainRegion && y != cairo && y != outerEgypt && y != lombardy && y != rome && y != naples && y != algeria && y != marmara && y != anatolia){
                        x.regions.remove(y);
                    }
                }
                if(x.regions.size()==0){
                    Country.bigList.remove(x);
                }
            }
        }
        String[] bigListOfNames = new String[Country.bigList.size()];
        for(int i = 0; i < Country.bigList.size(); i++){
            bigListOfNames[i] = Country.bigList.get(i).name;
        }

        String[] modes = {"Single Player","Multiplayer", "Simulation"};
        String mode = DropDownMenu.getSelectedChoice(modes, "Choose a game mode");
        //String mode = JOptionPane.showInputDialog("What game mode would you like to play?");
        JOptionPane.showMessageDialog(null, "You have chosen " + mode);
        //System.out.println("What game mode would you like to play?  \r\n You can choose from: Simulation, Single Player, or Multiplayer.");
        //String mode = scanner.nextLine();
        //scanner.nextLine();
        if (mode.equals("Simulation")){
            //System.out.println("You have chose simulation mode.");
            //JOptionPane.showMessageDialog(null, "You have chosen simulation mode");
        }
        else if(mode.equals("Single Player")){
            String chosen1 = DropDownMenu.getSelectedChoice(bigListOfNames, "Pick your country");
            //String chosen1 = JOptionPane.showInputDialog("Player 1 choose you country");
            JOptionPane.showMessageDialog(null, "You have chosen " + chosen1);
            for (Country x : Country.bigList) {
                if (x.name.equalsIgnoreCase(chosen1)) {
                    player1 = x;
                }
            }
            JOptionPane.showMessageDialog(null, "You are playing as " + player1);
        }
        else if(mode.equals("Multiplayer")){
            String[] possibleNumPlayers = new String[Country.bigList.size()];
            for(int i = 1; i <= Country.bigList.size() && i <= 8; i++){
                possibleNumPlayers[i-1] = Integer.toString(i);
            }
            int totalPlayers = Integer.parseInt(DropDownMenu.getSelectedChoice(possibleNumPlayers, "How many players?"));
            //int totalPlayers = Integer.parseInt(JOptionPane.showInputDialog("How many players?"));
            JOptionPane.showMessageDialog(null, "You have chosen " + totalPlayers);

            ArrayList<String> takenCountries = new ArrayList<>();

            String chosen1 = DropDownMenu.getSelectedChoice(bigListOfNames, "Pick your country");
            //String chosen1 = JOptionPane.showInputDialog("Player 1 choose you country");
            JOptionPane.showMessageDialog(null, "Player 1 is playing as " + chosen1);
            takenCountries.add(chosen1);
            for (Country x : Country.bigList) {
                if (x.name.equalsIgnoreCase(chosen1)) {
                    player1 = x;
                }
            }
            //System.out.println("You are playing as " + player1);

            if (totalPlayers > 1) {
                String chosen2 = DropDownMenu.getSelectedChoice(bigListOfNames, "Pick your country");
                while(takenCountries.contains(chosen2)){
                    JOptionPane.showMessageDialog(null,"This country is taken. Try again.");
                    chosen2 = DropDownMenu.getSelectedChoice(bigListOfNames, "Pick your country");
                }
                takenCountries.add(chosen2);
                //String chosen2 = JOptionPane.showInputDialog("Player 2 choose you country");
                JOptionPane.showMessageDialog(null, "Player 2 is playing as " + chosen2);
                for (Country x : Country.bigList) {
                    if (x.name.equalsIgnoreCase(chosen2)) {
                        player2 = x;
                    }
                }
                //JOptionPane.showMessageDialog(null, "You are playing as " + player2);
            }
            if (totalPlayers > 2) {
                String chosen3 = DropDownMenu.getSelectedChoice(bigListOfNames, "Pick your country");
                while(takenCountries.contains(chosen3)){
                    JOptionPane.showMessageDialog(null,"This country is taken. Try again.");
                    chosen3 = DropDownMenu.getSelectedChoice(bigListOfNames, "Pick your country");
                }
                takenCountries.add(chosen3);
                //String chosen3 = JOptionPane.showInputDialog("Player 3 choose you country");
                JOptionPane.showMessageDialog(null, "Player 3 is playing as " + chosen3);
                for (Country x : Country.bigList) {
                    if (x.name.equalsIgnoreCase(chosen3)) {
                        player3 = x;
                    }
                }
                //JOptionPane.showMessageDialog(null, "You are playing as " + player3);
            }
            if (totalPlayers > 3) {
                String chosen4 = DropDownMenu.getSelectedChoice(bigListOfNames, "Pick your country");
                while(takenCountries.contains(chosen4)){
                    JOptionPane.showMessageDialog(null,"This country is taken. Try again.");
                    chosen4 = DropDownMenu.getSelectedChoice(bigListOfNames, "Pick your country");
                }
                takenCountries.add(chosen4);
                //String chosen4 = JOptionPane.showInputDialog("Player 4 choose you country");
                JOptionPane.showMessageDialog(null, "Player 4 is playing as " + chosen4);
                for (Country x : Country.bigList) {
                    if (x.name.equalsIgnoreCase(chosen4)) {
                        player4 = x;
                    }
                }
                //JOptionPane.showMessageDialog(null, "You are playing as " + player4);
            }
            if (totalPlayers > 4) {
                String chosen5 = DropDownMenu.getSelectedChoice(bigListOfNames, "Pick your country");
                while(takenCountries.contains(chosen5)){
                    JOptionPane.showMessageDialog(null,"This country is taken. Try again.");
                    chosen5 = DropDownMenu.getSelectedChoice(bigListOfNames, "Pick your country");
                }
                takenCountries.add(chosen5);
                //String chosen5 = JOptionPane.showInputDialog("Player 5 choose you country");
                JOptionPane.showMessageDialog(null, "Player 5 is playing as " + chosen5);
                for (Country x : Country.bigList) {
                    if (x.name.equalsIgnoreCase(chosen5)) {
                        player5 = x;
                    }
                }
                //JOptionPane.showMessageDialog(null, "You are playing as " + player5);
            }
            if (totalPlayers > 5) {
                String chosen6 = DropDownMenu.getSelectedChoice(bigListOfNames, "Pick your country");
                while(takenCountries.contains(chosen6)){
                    JOptionPane.showMessageDialog(null,"This country is taken. Try again.");
                    chosen6 = DropDownMenu.getSelectedChoice(bigListOfNames, "Pick your country");
                }
                takenCountries.add(chosen6);
                //String chosen6 = JOptionPane.showInputDialog("Player 6 choose you country");
                JOptionPane.showMessageDialog(null, "Player 6 is playing as " + chosen6);
                for (Country x : Country.bigList) {
                    if (x.name.equalsIgnoreCase(chosen6)) {
                        player6 = x;
                    }
                }
                //JOptionPane.showMessageDialog(null, "You are playing as " + player6);
            }
            if (totalPlayers > 6) {
                String chosen7 = DropDownMenu.getSelectedChoice(bigListOfNames, "Pick your country");
                while(takenCountries.contains(chosen7)){
                    JOptionPane.showMessageDialog(null,"This country is taken. Try again.");
                    chosen7 = DropDownMenu.getSelectedChoice(bigListOfNames, "Pick your country");
                }
                takenCountries.add(chosen7);
                //String chosen7 = JOptionPane.showInputDialog("Player 7 choose you country");
                JOptionPane.showMessageDialog(null, "Player 7 is playing as " + chosen7);
                for (Country x : Country.bigList) {
                    if (x.name.equalsIgnoreCase(chosen7)) {
                        player7 = x;
                    }
                }
                //JOptionPane.showMessageDialog(null, "You are playing as " + player7);
            }
            if (totalPlayers > 7) {
                String chosen8 = DropDownMenu.getSelectedChoice(bigListOfNames, "Pick your country");
                while(takenCountries.contains(chosen8)){
                    JOptionPane.showMessageDialog(null,"This country is taken. Try again.");
                    chosen8 = DropDownMenu.getSelectedChoice(bigListOfNames, "Pick your country");
                }
                takenCountries.add(chosen8);
                //String chosen8 = JOptionPane.showInputDialog("Player 8 choose you country");
                JOptionPane.showMessageDialog(null, "Player 8 is playing as " + chosen8);
                for (Country x : Country.bigList) {
                    if (x.name.equalsIgnoreCase(chosen8)) {
                        player8 = x;
                    }
                }
                //JOptionPane.showMessageDialog(null, "You are playing as " + player8);
            }
        }

        String[] choice  = {"Yes", "No"};
        String simBot = DropDownMenu.getSelectedChoice(choice,"Would you like to sim through bot moves?");
        if(simBot.equals("No")){
            simBots = false;
        }



        while (Country.bigList.size() > 1 && turnCount < 215) {
            Country.fullGame();
            turnCount++;
        }
        /*String winner = Country.bigList.get(0).name;
        if(Country.bigList.get(0).alliance.size() > 2) {
            for (int i = 1; i < Country.bigList.get(0).alliance.size() - 1; i++) {
                winner += ", " + Country.bigList.get(0).alliance.get(i);
            }
        }
        Country.bigList.get(0).alliance = Country.removeDuplicatesC(Country.bigList.get(0).alliance);
        if(Country.bigList.get(0).alliance.size() > 1) {
            winner += ", and " + Country.bigList.get(0).alliance.get(Country.bigList.get(0).alliance.size()-1);
        } */

        if (Country.bigList.size() > 1){
            String remaining = "";
            for(Country x : Country.bigList) {
                for (String y : x.allianceNames){
                    remaining += " " + y;
                }
            }
            JOptionPane.showMessageDialog(null, "The world has realized the fault in its warring ways, and has declared world peace for all!");
            JOptionPane.showMessageDialog(null, "The nations who will help build this new world for better or for worse are " + remaining);
        }
        else if (Country.bigList.get(0) == player1 || Country.bigList.get(0) == player2 || Country.bigList.get(0) == player3 || Country.bigList.get(0) == player4) {
            JOptionPane.showMessageDialog(null, "And the winner is " + Country.bigList.get(0) + "!!! You and the citizens of " + Country.bigList.get(0) + " may now sleep peacefully. Together you will rebuild this war torn world on the foundations of peace and morality.");
        }
        else {
            JOptionPane.showMessageDialog(null, "And the winner is " + Country.bigList.get(0) + "!!! Now you must live under the tyrannical rule of " + Country.bigList.get(0) + ". You and your people have been eradicated while " + Country.bigList.get(0) + "'s oligarchy has established a new world order built on the foundations of death and destruction.");
            JOptionPane.showMessageDialog(null, "The Nations who will help to rule this new world are " + Country.bigList.get(0).allianceNames);
        }
    }
}

