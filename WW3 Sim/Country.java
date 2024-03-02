import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Country {
    public String name;
    public int strength;
    public static ArrayList<Country> bigList = new ArrayList<>();
    public ArrayList<Country> touching;
    //Use a 2 dimensional array for anger
    public ArrayList<Integer> anger;
    public ArrayList<Region> regions;
    private final static Scanner scanner = new Scanner(System.in);
    private static boolean worked = true;
    private static String acceptAlliance = "true";
    private static String gobbly = "";
    public ArrayList<Integer> groups;
    public ArrayList<Country> alliance;
    public ArrayList<String> allianceNames;

    public Country(String n, ArrayList<Country> t, ArrayList<Integer> a, ArrayList<Region> r, ArrayList<Integer> g, ArrayList<Country> all, ArrayList<String> allNames) {
        name = n;
        touching = t;
        anger = a;
        regions = r;
        groups = g;
        alliance = all;
        allianceNames = allNames;
    }


    public String toString() {
        return name;
    }

    public static Country randomCountry() {
        ArrayList<Integer> totalAnger = new ArrayList<>();
        for (Country x : bigList) {
            int count = 0;
            for (int y : x.anger) {
                count += y;
            }
            totalAnger.add(count);
        }
        //System.out.println("The bigList size is: " + bigList.size());
        ArrayList<Country> warum = attackProbability(bigList, totalAnger);
        //System.out.println(warum);
        return warum.get((int) (Math.random() * warum.size()));
    }

    /*public int angerByBorder() {
        ArrayList<Integer> theseIndeces = new ArrayList<Integer>();
        for (int i = 0; i < this.touching.size(); i++) {
            if (this.touching.get(i) == bigList.get(i)) {
                theseIndeces.add(i);
            }
        }
        int sum = 0;
        for (int i = 0; i < touching.size(); i++) {
            sum += anger.get(theseIndeces.get(i));
        }
        return sum;
    }*/

    public static ArrayList<Country> attackProbability(ArrayList<Country> bourd, ArrayList<Integer> arger) {
        ArrayList<Country> probs = new ArrayList<>();
        ArrayList<Integer> theseIndeces = new ArrayList<>();
        for (Country x : bourd) {
            for (int k = 0; k < bigList.size(); k++)
                if (x == bigList.get(k)) {
                    theseIndeces.add(k);
                }
        }

        //System.out.println(theseIndeces);
        //for(int i = 0; i < bourd.size(); i++){
        //System.out.print("THE I VALUE FOR THIS SECTION IS " + i + "     ");
        for (int j = 0; j < theseIndeces.size(); j++) {
            //System.out.print("THE J VALUE FOR THIS SECTION IS " + j + "      ");
            for (int k = 0; k < arger.get(theseIndeces.get(j)); k++) {
                //System.out.println(k + "     ");
                //System.out.println(arger.get(theseIndeces.get(j)));
                probs.add(bourd.get(j));
                //System.out.println("\r\n" + probs + "\r\n");
            }
        }
        //System.out.println("\r\n" + probs + "\r\n");
        /*String fechs = "";
        for(int i = 0; i < bourd.size(); i++){
            fechs += bourd.get(i) + " is " + arger.get(theseIndeces.get(i)) + " angry \r\n";
        }
        System.out.println(fechs);*/
        if(probs.size()==0) {
            probs = bourd;
        }
        return probs;
    }

    public Country defendingForce() {
        ArrayList<Country> rell = attackProbability(this.touching, this.anger);
        //System.out.println(rell);
        return rell.get((int) (Math.random() * rell.size()));
    }

    public Country alliance() {
        int max = 0;
        for(int x : this.anger){
            if(max < x){
                max = x;
            }
        }
        ArrayList<Integer> happyness = new ArrayList<>();
        for (int x : this.anger) {
            happyness.add(max - x + 1);
        }
        ArrayList<Country> pell = attackProbability(this.touching, happyness);
        //System.out.println("Pell: " + pell);
        return pell.get((int) (Math.random() * pell.size()));
    }

    public static ArrayList<Integer> removeDuplicatesI(ArrayList<Integer> list)
    {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer element : list) {

            // If this element is not present in newList then add it
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        // return the new list
        return newList;
    }
    public static ArrayList<String> removeDuplicatesS(ArrayList<String> list)
    {
        ArrayList<String> newList = new ArrayList<>();
        for (String element : list) {

            // If this element is not present in newList then add it
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        // return the new list
        return newList;
    }
    public static ArrayList<Region> removeDuplicatesR(ArrayList<Region> list)
    {
        ArrayList<Region> newList = new ArrayList<>();
        for (Region element : list) {

            // If this element is not present in newList then add it
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        // return the new list
        return newList;
    }
    public static ArrayList<Country> removeDuplicatesC(ArrayList<Country> list)
    {
        ArrayList<Country> newList = new ArrayList<>();
        for (Country element : list) {

            // If this element is not present in newList then add it
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        // return the new list
        return newList;
    }


    public static void acceptAlliance(Country m, Country h){
        acceptAlliance = "true";
        //System.out.println(m + " strength " + m.strength + " would like to make an alliance with " + h + ". Do you accept?");
        //String accept = scanner.nextLine();
        String[] choices = {"Yes","No"};
        String accept = DropDownMenu.getSelectedChoice(choices, "Would you like to ally with " + m);
        //scanner.nextLine();
        if(accept.equals("No")){
            acceptAlliance = "false";
            if(m == Main.player1 || m == Main.player2 ||m == Main.player3 ||m == Main.player4 ||m == Main.player5 ||m == Main.player6 ||m == Main.player7 ||m == Main.player8) {
                JOptionPane.showMessageDialog(null, h + " has decided to reject your offer");
            }
            else{
                JOptionPane.showMessageDialog(null, h + " rejected " + m + "'s offer for alliance.");
            }
        }
        else if (accept.equals("Yes")){
            acceptAlliance = "true";
        }
        /*else{
            acceptAlliance = null;
            while(acceptAlliance == null) {
                System.out.println("Invalid. Try again.");
                System.out.println(m + " strength " + m.strength + " would like to make an alliance with " + h + ". Do you accept?");
                accept = scanner.nextLine();
                scanner.nextLine();
                if (accept.equalsIgnoreCase("I do not accept") || accept.equalsIgnoreCase("I don't accept") || accept.equalsIgnoreCase("no") || accept.equalsIgnoreCase("I do not accept ") || accept.equalsIgnoreCase("I don't accept ") || accept.equalsIgnoreCase("no ")) {
                    acceptAlliance = "false";
                } else if (accept.equalsIgnoreCase("I accept") || accept.equalsIgnoreCase("I do") || accept.equalsIgnoreCase("yes") || accept.equalsIgnoreCase("I accept ") || accept.equalsIgnoreCase("I do ") || accept.equalsIgnoreCase("yes ")) {
                    acceptAlliance = "true";
                }
            }
        }*/
    }
    public static String allianceGroups(Country m, Country h){
        m.alliance.addAll(h.alliance);
        m.allianceNames.addAll(h.allianceNames);
        m.alliance = removeDuplicatesC(m.alliance);
        if(m.alliance.size() > 2){
            for(Country x : m.alliance){
                x.groups = removeDuplicatesI(x.groups);
            }
            String newName;
            int[] gruper = new int[21];
            for(Country x : m.alliance){
                for(int i : x.groups) {
                    gruper[i] ++;
                }
            }
            int max = 0;
            int indexOfMax = 0;
            for(int j = 0; j < gruper.length; j++){
                if (gruper[j] > max){
                    max = gruper[j];
                    indexOfMax = j;
                }
            }
            ArrayList<String> takenNames = new ArrayList<>();
            for(Country x : bigList){
                if(x.name.equals("OPEC") ||  x.name.equals("UNASUR") || x.name.equals("Orthodoxia") || x.name.equals("ASEAN") || x.name.equals("Berlin Conference Retribution") || x.name.equals("The Hispanosphere") || x.name.equals("North American Union") || x.name.equals("The Francosphere") || x.name.equals("Arctic Circle") || x.name.equals("The Orient") || x.name.equals("Axis Powers") || x.name.equals("Allies") || x.name.equals("The Anglosphere") || x.name.equals("The Foourth Caliphate") || x.name.equals("BRICS") || x.name.equals("European Union") || x.name.equals("Soviet Resurrection") || x.name.equals("United Small Nations") || x.name.equals("United Anti-Colonial States") || x.name.equals("Mongolian Empire")){
                    takenNames.add(x.name);
                }
            }
            /*for(Country x : m.alliance){
                for(int y : x.groups){
                    System.out.println(x + " is a(n) " + y);
                }
            }*/
            if(indexOfMax == Main.revolt && (!takenNames.contains("Rebels") || m.name.equals("Rebels") || h.name.equals("Rebels"))){
                newName = "Rebels";
            }
            else if(indexOfMax == Main.opec && (!takenNames.contains("OPEC") || m.name.equals("OPEC") || h.name.equals("OPEC"))){
                newName = "OPEC";
            }
            else if(indexOfMax == Main.southAmerican && (!takenNames.contains("UNASUR") || m.name.equals("UNASUR") || h.name.equals("UNASUR"))){
                newName = "UNASUR";
            }
            else if(indexOfMax == Main.orthodox && (!takenNames.contains("Orthodoxia") || m.name.equals("Orthodoxia") || h.name.equals("Orthodoxia"))){
                newName = "Orthodoxia";
            }
            else if(indexOfMax == Main.asean && (!takenNames.contains("ASEAN") || m.name.equals("ASEAN") || h.name.equals("ASEAN"))){
                newName = "ASEAN";
            }
            else if(indexOfMax == Main.african && (!takenNames.contains("Berlin Conference Retribution") || m.name.equals("Berlin Conference Retribution") || h.name.equals("Berlin Conference Retribution"))){
                newName = "Berlin Conference Retribution";
            }
            else if(indexOfMax == Main.spanish && (!takenNames.contains("The Hispanosphere") || m.name.equals("The Hispanosphere") || h.name.equals("The Hispanosphere"))){
                newName = "The Hispanosphere";
            }
            else if(indexOfMax == Main.northAmerican && (!takenNames.contains("North American Union") || m.name.equals("North American Union") || h.name.equals("North American Union"))){
                newName = "North American Union";
            }
            else if(indexOfMax == Main.french && (!takenNames.contains("The Francosphere") || m.name.equals("The Francosphere") || h.name.equals("The Francosphere"))){
                newName = "The Francosphere";
            }
            else if(indexOfMax == Main.eastern && (!takenNames.contains("The Orient") || m.name.equals("The Orient") || h.name.equals("The Orient"))){
                newName = "The Orient";
            }
            else if(indexOfMax == Main.allies && (!takenNames.contains("Allies") || m.name.equals("Allies") || h.name.equals("Allies"))){
                newName = "Allies";
            }
            else if(indexOfMax == Main.english && (!takenNames.contains("The Anglosphere") || m.name.equals("The Anglosphere") || h.name.equals("The Anglosphere"))){
                newName = "The Anglosphere";
            }
            else if(Main.map != "Arctic" &&  indexOfMax == Main.arctic && (!takenNames.contains("Arctic Circle") || m.name.equals("Arctic Circle") || h.name.equals("Arctic Circle"))){
                newName = "Arctic Circle";
            }
            else if(indexOfMax == Main.axis && (!takenNames.contains("Axis Powers") || m.name.equals("Axis Powers") || h.name.equals("Axis Powers"))){
                newName = "Axis Powers";
            }
            else if(indexOfMax == Main.muslim && (!takenNames.contains("The Fourth Caliphate") || m.name.equals("The Fourth Caliphate") || h.name.equals("The Fourth Caliphate"))){
                newName = "The Fourth Caliphate";
            }
            else if(indexOfMax == Main.brics && (!takenNames.contains("BRICS") || m.name.equals("BRICS") || h.name.equals("BRICS"))){
                newName = "BRICS";
            }
            else if(indexOfMax == Main.mongol && (!takenNames.contains("Mongolian Empire")  || m.name.equals("Mongolian Empire") || h.name.equals("Mongolian Empire"))){
                newName = "Mongolian Empire";
            }
            else if(indexOfMax == Main.soviets && (!takenNames.contains("Soviet Resurrection") || m.name.equals("Soviet Resurrection") || h.name.equals("Soviet Resurrection"))){
                newName = "Soviet Resurrection";
            }
            else if(Main.map != "Europe" && indexOfMax == Main.european && (!takenNames.contains("European Union") || m.name.equals("European Union") || h.name.equals("European Union"))){
                newName = "European Union";
            }
            else if(indexOfMax == Main.smallNations && (!takenNames.contains("United Small Nations") || m.name.equals("United Small Nations") || h.name.equals("United Small Nations"))){
                newName = "United Small Nations";
            }
            else if(indexOfMax == Main.colonies && (!takenNames.contains("United Anti-Colonial States") || m.name.equals("United Anti-Colonial States") || h.name.equals("United Anti-Colonial States"))){
                newName = "United Anti-Colonial States";
            }
            else{
                newName = m.name.substring(0, 3);
                for (int i = 0; i < m.alliance.size(); i++) {
                    if(m.alliance.get(i).name.length() >= 3){
                        newName += m.alliance.get(i).name.substring(0, 3).toLowerCase();
                    }
                    else {
                        newName += m.alliance.get(i).name.toLowerCase();
                    }
                }
            }
            if(m.name.length() >= 5){
                if(m.alliance.size() > bigList.size() / 2 && m.name.substring(0,5).equals("The N")){
                    newName = "The New World Order under " + m.name;
                }
            }
            m.name = newName;
        }
        else{
            m.name = m.name + "-" + h.name;
        }
        return m.name;
    }
    public static void updateTouching(){
        // Sets anger against yourself to 0
        for(Country x : bigList){
            x.anger.set(bigList.indexOf(x), 0);
            // Enforces anger ceiling
            for(int i = 0; i < x.anger.size(); i++){
                if (x.anger.get(i) > 64){
                    x.anger.set(i, 64);
                }
            }
        }
        //Updates each country's strength
        for(Country x : bigList){
            int sum = 0;
            for(Region y : x.regions){
                sum += y.strength;
            }
            x.strength = sum;
        }
        //Updates each country's touching
        for (Country x : bigList) {
            x.touching = removeDuplicatesC(x.touching);
            ArrayList<Region> rawRegions = new ArrayList<>();
            for (Region y : x.regions) {
                    rawRegions.addAll(y.touching);
            }

            //System.out.println("Duplicates removed: " + x.touching);
            ArrayList<Region> noDup = removeDuplicatesR(rawRegions);
            ArrayList<Country> addThese = new ArrayList<>();
            for (Country y : bigList) {
                for (Region z : noDup) {
                    if (y.regions.contains(z)) {
                        addThese.add(y);
                        //System.out.println(x + "'s new touching is " + addThese);
                    }
                }
            }
            addThese = removeDuplicatesC(addThese);
            x.touching = addThese;
            x.touching = removeDuplicatesC(x.touching);
            for(int y = x.touching.size() - 1; y >= 0; y--){
                Country z = x.touching.get(y);
                if(z == x){
                    x.touching.remove(y);
                }
            }
        }
    }



    public void maneuverTroopsPlayer(){
        String regionStrengths = "The current strengths of your regions are:";
        for(Region r : this.regions) {
            regionStrengths += "\n" + r + ": " + r.strength;
        }
        JOptionPane.showMessageDialog(null,regionStrengths);
        String[] regionNames = new String[this.regions.size()];
        for(int i = 0; i < this.regions.size(); i++){
            regionNames[i] = this.regions.get(i).name;
        }
        String takeFromS = DropDownMenu.getSelectedChoice(regionNames,"What region would you like to move troops from?");
        String giveToS = DropDownMenu.getSelectedChoice(regionNames, "What region would you like to move troops to?");
        Region takeFrom = new Region(null, 0, null, 0, 0);
        Region giveTo = new Region(null, 0, null, 0, 0);
        for(Region x : this.regions){
            if(x.name.equals(takeFromS)){
                takeFrom = x;
            }
            if(x.name.equals(giveToS)){
                giveTo = x;
            }
        }
        int howMany = Integer.parseInt(JOptionPane.showInputDialog("How many troops would you like to move? (It must be " + takeFrom.strength + " or less)"));
        takeFrom.strength -= howMany;
        giveTo.strength += howMany;
    }



    public void maneuverTroopsBot(){
        Region takeFrom = this.regions.get((int)(Math.random()*this.regions.size()));
        Region giveTo = this.regions.get((int)(Math.random()*this.regions.size()));
        int howMany = (int)(Math.random()*takeFrom.strength);

        takeFrom.strength -= howMany;
        giveTo.strength += howMany;
        //System.out.println(takeFrom + ": " + takeFrom.strength + "    " + giveTo + ": " + giveTo.strength + "    " + howMany);
    }



    public static void playerControl(Country m){
        String mTempName = m.name;
        //System.out.println("It time to take action. Would you like to make an alliance, attack, or pass?");
        //String method = scanner.nextLine();
        //scanner.nextLine();
        String[] actions = {"Attack", "Alliance", "Pass"};
        String method = DropDownMenu.getSelectedChoice(actions, "Choose an action");
        if (method.equalsIgnoreCase(("make an alliance")) || method.equalsIgnoreCase(("alliance")) || method.equalsIgnoreCase(("make an alliance ")) || method.equalsIgnoreCase(("alliance "))) {
            worked = true;
            //System.out.println("Which of these countries would you like to make an alliance with? " + m.touching);
            //String ally = scanner.nextLine();
            //scanner.nextLine();
            String[] mTouchingNames = new String[m.touching.size()];
            for(int i = 0; i < m.touching.size(); i++){
                mTouchingNames[i] = m.touching.get(i).name;
            }
            String ally = DropDownMenu.getSelectedChoice(mTouchingNames, "Choose a country to ally with");
            Country h = new Country("null", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(),  new ArrayList<>(), new ArrayList<>());
            for (Country x : m.touching) {
                if (x.name.equalsIgnoreCase(ally)) {
                    h = x;
                }
            }
            /*while (h.name.equals("null")) {
                System.out.println("That country is not valid. Try again");
                ally = scanner.nextLine();
                scanner.nextLine();
                for(Country x : m.touching){
                    if (x.name.equalsIgnoreCase(ally)) {
                        h = x;
                    }
                }
            }*/
            int indexOfM = bigList.indexOf(m);
            if(Math.random() * h.anger.get(indexOfM) < .6){
                acceptAlliance = "true";
            }
            if(h == Main.player1 || h == Main.player2 || h == Main.player3 || h == Main.player4 || h == Main.player5 || h == Main.player6 || h == Main.player7 || h == Main.player8){
                acceptAlliance(m,h);
            }
            if (acceptAlliance.equals("true")) {
                m.name = allianceGroups(m, h);
                m.name = JOptionPane.showInputDialog("What would you like to call this new alliance?");
                //System.out.println("What would you like to call this new alliance?");
                //String newName = scanner.nextLine();
                //scanner.nextLine();
                gobbly += mTempName + "\r\n strength " + m.strength + " is allying with " + h.name + " strength " + h.strength + ". They are now considered " + m.name + " strength " + (m.strength + h.strength);
                //System.out.println(gobbly);
                m.regions.addAll(h.regions);
                //Indeces
                int a = bigList.indexOf(m);
                int b = bigList.indexOf(h);

                //Sets all angers[a] to angers[a] + anger[b]
                for (Country x : bigList) {
                    if (x != m && x != h) {
                        x.anger.set(a, x.anger.get(a) + x.anger.get(b));
                    }
                }
                //Sets m's anger[a] against every country to anger[a] + anger[b]
                //System.out.println(m + "'s anger size is " + m.anger.size());
                //System.out.println(h + "'s anger size is " + h.anger.size());
                if (m.anger.size() > h.anger.size()) {
                    for (int i = 0; i < h.anger.size(); i++) {
                        m.anger.set(i, m.anger.get(i) + h.anger.get(i));
                    }
                }
                if (m.anger.size() <= h.anger.size()) {
                    for (int i = 0; i < m.anger.size(); i++) {
                        m.anger.set(i, m.anger.get(i) + h.anger.get(i));
                    }
                }
                for(Country x : bigList){
                    if(x.touching.contains(h)){
                        x.touching.remove(h);
                    }
                }
                //removes from bigList
                h.regions.removeAll(h.regions);
                bigList.remove(b);
                //removes from each country's anger
                for (Country x : bigList) {
                    x.anger.remove(b);
                }
            }
            else{
                gobbly += "\r\n" + h + " has decided to decline you offer of alliance.";
                //System.out.println(gobbly);
            }
        }
        else if(method.equalsIgnoreCase(("attack")) || method.equalsIgnoreCase(("invade")) || method.equalsIgnoreCase(("attack ")) || method.equalsIgnoreCase(("invade "))) {
            worked = true;
            if(m.strength < 50 * m.regions.size()){
                revolt();
            }
            String[] mTouchingNames = new String[m.touching.size()];
            for(int i = 0; i < m.touching.size(); i++){
                mTouchingNames[i] = m.touching.get(i).name;
            }
            String attack = DropDownMenu.getSelectedChoice(mTouchingNames,"Choose a country to attack");
            //System.out.println("Which of these nations would you like to invade? " + m.touching);
            //String attack = scanner.nextLine();
            //scanner.nextLine();
            Country p = new Country("null",new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(),  new ArrayList<>(), new ArrayList<>());
            for(Country x : m.touching){
                if (x.name.equalsIgnoreCase(attack)){
                    p = x;
                }
            }
            /*while (p.name.equals("null")){
                System.out.println("That country is not valid. Try again");
                attack = scanner.nextLine();
                scanner.nextLine();
                for(Country x : m.touching){
                    if (x.name.equalsIgnoreCase(attack)){
                        p = x;
                    }
                }
            }*/
            ArrayList<Region> rawRegions = new ArrayList<>();
            for(Region x : m.regions){
                    rawRegions.addAll(x.touching);
            }
            ArrayList<Region> noDup = removeDuplicatesR(rawRegions);
            for(int i = noDup.size() - 1; i >= 0; i--){
                if(m.regions.contains(noDup.get(i))){
                    noDup.remove(i);
                }
            }
            ArrayList<Region> onlyInvadedNationRegions = new ArrayList<>();
            for(Region x : noDup){
                if(p.regions.contains(x)){
                    onlyInvadedNationRegions.add(x);
                }
            }

            String[] oINRArray = new String[onlyInvadedNationRegions.size()];
            for(int i = 0; i < onlyInvadedNationRegions.size(); i++){
                oINRArray[i] = onlyInvadedNationRegions.get(i).name;
            }
            String invadeRegionString = DropDownMenu.getSelectedChoice(oINRArray, "Choose a region to invade");
            //System.out.println("Which region would you like to invade? " + onlyInvadedNationRegions);
            //String invadeRegionString = scanner.nextLine();
            //scanner.nextLine();
            Region invadeRegion = new Region("null", 0, null,0,0);
            for(Region x : noDup){
                if(x.name.equalsIgnoreCase(invadeRegionString)){
                    invadeRegion = x;
                }
            }
            /*while (invadeRegion.name.equals("null")){
                System.out.println("That region is not valid. Try again");
                invadeRegionString = scanner.nextLine();
                scanner.nextLine();
                for(Region x : noDup){
                    if (x.name.equalsIgnoreCase(invadeRegionString)){
                        invadeRegion = x;
                    }
                }
            }*/
            gobbly += m.name + "\r\n strength " + m.strength + " is invading " + p.name + " strength " + p.strength + " at " + invadeRegion;
            //System.out.println(gobbly);
            //System.out.println();
            int surroundingTroops = 0;
            for (Region x : m.regions) {
                if (invadeRegion.touching.contains(x)) {
                    surroundingTroops += x.strength;
                }
            }
            int aggressor = (int) (Math.random() * surroundingTroops);
            int defender = (int) (Math.random() * (invadeRegion.strength + invadeRegion.dStrength));
            int a = 0;
            int b = 0;
            for (int i = 0; i < bigList.size(); i++) {
                if (m == bigList.get(i)) {
                    a = i;
                }
                if (p == bigList.get(i)) {
                    b = i;
                }
            }
            if (aggressor > defender) {
                for(Region x : m.regions){
                    x.anger -= 5;
                }
                invadeRegion.strength = (int)(invadeRegion.strength * Math.random());
                invadeRegion.anger += 1;
                m.regions.add(invadeRegion);
                p.regions.remove(invadeRegion);
                m.anger.set(b, m.anger.get(b) * 2);
                p.anger.set(a, p.anger.get(a) * 2);
                int newStrength = m.strength + invadeRegion.strength;
                gobbly += "\r\n" + m + " successfully invaded " + invadeRegion + ". " + m + "'s new strength is " + newStrength;
                //System.out.println(gobbly);
                if(p.regions.size() < 1){
                    bigList.remove(p);
                    for (Country x : bigList){
                        x.touching.remove(p);
                        x.anger.remove(b);
                    }
                    //System.out.println(p + " has fallen to " + m);
                    JOptionPane.showMessageDialog(null, p + " has fallen to " + m);
                }
                if ((p == Main.player1 || p == Main.player2 || p == Main.player3 || p == Main.player4 || p == Main.player5 || p == Main.player6 || p == Main.player7 || p == Main.player8)) {
                    double lp = (Math.random() * 4);
                    String lpp;
                    if (lp < 1) {
                        lpp = "eastern";
                    } else if (lp < 2) {
                        lpp = "western";
                    } else if (lp < 3) {
                        lpp = "southern";
                    } else {
                        lpp = "northern";
                    }
                    Region r = m.regions.get((int)(Math.random() * m.regions.size()));
                    gobbly +="\r\n" + p + " has been destroyed. You have been sent to a POW camp in " + lpp + " " + r + " and you country has become a puppet state of " + m + ". Now you must watch as your people suffer and you home falls to ruin.";
                    //System.out.println();
                }
                else{
                    //System.out.println(p + " has lost its region " + invadeRegion.name + " to " + m);
                    JOptionPane.showMessageDialog(null,p + " has lost its region " + invadeRegion.name + " to " + m);
                }
                m.strength += invadeRegion.strength;
                //gobbly += "\r\n" + m + " successfully invaded " + invadeRegion + ". " + m + "'s new strength is " + m.strength;
                //System.out.println(gobbly);
            }

            if (aggressor <= defender) {
                for(Region x : m.regions){
                    if(invadeRegion.touching.contains(x)) {
                        x.strength = (int)(x.strength * Math.random());
                        x.anger += 10;
                    }
                }
                updateTouching();

                m.anger.set(b, m.anger.get(b) * 2);
                p.anger.set(a, p.anger.get(a) * 2);
                for(Country x : bigList){
                    int sum = 0;
                    for(Region y : x.regions){
                        sum += y.strength;
                    }
                    x.strength = sum;
                }
                gobbly += "\r\n" +p + " successfully defended " + invadeRegion + " from " + m + ". " + p + "'s current strength is " + p.strength + ". " + m + "'s new strength is " + m.strength;
                //System.out.println(gobbly);
                //System.out.println();
            }
        }
        else if(method.equalsIgnoreCase(("pass")) || method.equalsIgnoreCase(("pass "))){
            worked = true;
            gobbly += "\r\n No action this round.";
        }
        else{
            worked = false;
        }
        String[] choices = {"Yes", "No"};
        String manTroops = DropDownMenu.getSelectedChoice(choices, "Would you like to maneuver your troops?");
        while(manTroops.equals("Yes")){
            m.maneuverTroopsPlayer();
            manTroops = DropDownMenu.getSelectedChoice(choices, "Would you like to continue maneuvering your troops?");
        }
        ArrayList<Country> leaderBoard = bigList;
        for(int j = 0; j < leaderBoard.size() - 1; j++)
        {
            int maxIndex = j;
            for (int k = j + 1; k < leaderBoard.size(); k++)
            {
                if (leaderBoard.get(k).strength > leaderBoard.get(maxIndex).strength)
                {
                    maxIndex = k;
                }
            }
            Country temp = leaderBoard.get(j);
            leaderBoard.set(j, leaderBoard.get(maxIndex));
            leaderBoard.set(maxIndex, temp);
        }
        String leaderBoardString = "";
        for(int i = 0; i < leaderBoard.size(); i++) {
            leaderBoardString += (i+1) + ". " + leaderBoard.get(i).name + ": " + leaderBoard.get(i).strength + ". \n";
        }
        //System.out.println("The current leader board looks like: \n " + schehm);
        if(Main.simBots){
            JOptionPane.showMessageDialog(null, gobbly);
            JOptionPane.showMessageDialog(null, leaderBoardString);
        }
    }
    public static void revolt(){
        for(int i = bigList.size() - 1; i > -1; i--) {
            Country x = bigList.get(i);
            if (!x.groups.contains(Main.revolt)) {
                for (int j = x.regions.size() - 1; j > -1; j--) {
                    Region y = x.regions.get(j);
                    if (y.strength * Math.random() < 25 && y.revoltCount < 1 && y.anger > 80) {
                        y.revoltCount ++;
                        //System.out.println(x + "'s government has attempted exerted Marshal Law over " + y + " but failed. Rebels overpowered the depleted ground forces in " + y + " forcing " + x + " to recognize " + y + " as an independent nation.");
                        if(!Main.simBots) {
                            JOptionPane.showMessageDialog(null, x + "'s government has attempted exerted Marshal Law over " + y + " but failed. Rebels overpowered the depleted ground forces in " + y + " forcing " + x + " to recognize " + y + " as an independent nation.");
                        }
                        x.regions.remove(y);
                        ArrayList<Region> yRegions = new ArrayList<>();
                        yRegions.add(y);
                        ArrayList<Country> yTouching = new ArrayList<>();
                        for (Region z : y.touching) {
                            for (Country w : bigList) {
                                if (w.regions.contains(z)) {
                                    yTouching.add(w);
                                }
                            }
                        }
                        ArrayList<Integer> yAnger = new ArrayList<>();
                        for (Country w : bigList) {
                            yAnger.add(1);
                            w.anger.add(1);
                        }
                        yAnger.add(bigList.size(),0);
                        yAnger.set(i, 50);
                        x.anger.set(bigList.size(), 50);
                        ArrayList<Integer> yGroups = new ArrayList<>();
                        yGroups.add(Main.revolt);
                        Country n = new Country(y.name, yTouching, yAnger, yRegions, yGroups, new ArrayList<>(), new ArrayList<>());
                        bigList.add(n);
                        updateTouching();
                        if(x.strength == 0){
                            bigList.remove(x);
                        }
                    }
                }
            }
        }
    }

    public static void fullGame() {
        gobbly = "";
        //System.out.println("The map is " + Main.map);
        /*for(Country x : bigList){
            System.out.println(x + "'s angers are: ");
            System.out.println();
            for(int y = 0; y < bigList.size(); y++){
                System.out.println(x.anger.get(y) + " against " + bigList.get(y));
            }
            /*if(x.anger.size() != bigList.size()) {
                System.out.println("There is a problem with " + x + "'s anger");
                System.out.println(bigList.size() + " " + x.anger.size());
            }
        }*/

        updateTouching();
        revolt();
        updateTouching();

        for(Country x : bigList){
            x.alliance.add(x);
            x.alliance = removeDuplicatesC(x.alliance);
        }
        for(Country x : bigList){
            int sum = 0;
            for(Region y : x.regions){
                sum += y.strength;
            }
            x.strength = sum;
            if(x.strength <= 100 && !x.groups.contains(Main.smallNations)){
                x.groups.add(Main.smallNations);
            }
            else if(x.groups.contains(Main.smallNations)){
                x.groups.remove(x.groups.indexOf(Main.smallNations));
            }
        }
        updateTouching();

        Country m = randomCountry();

        String mTempName = m.name;
        if (m == Main.player1 || m == Main.player2 || m == Main.player3  || m == Main.player4 || m == Main.player5 || m == Main.player6 || m == Main.player7  || m == Main.player8){
            //System.out.println("It is " + m + "'s turn.");
            JOptionPane.showMessageDialog(null, "It is " + m + "'s turn.");
            playerControl(m);
            /*while(!worked){
                System.out.println("That is invalid. Try again.");
                playerControl(m);

            }*/
        }


        if(m != Main.player1 && m != Main.player2 && m != Main.player3  && m != Main.player4 && m != Main.player5 && m != Main.player6 && m != Main.player7  && m != Main.player8) {
            //System.out.println(m.name);

//////////HERERERERERE
            while (m.strength < 20) {
                for (int i = 0; i < m.anger.size() - 1; i++) {
                    m.anger.set(i, m.anger.get(i) * 3 / 4);
                }
                m = randomCountry();
            }
            double averageAnger = 0.0;
            ArrayList<Integer> touchingAnger = new ArrayList<>();
            for (Country x : m.touching) {
                for (Country y : bigList) {
                    if (x == y) {
                        int a = bigList.indexOf(y);
                        touchingAnger.add(m.anger.get(a));
                    }
                }
            }
            //System.out.println(m + " is actually touching " + m.touching);
            //System.out.println("The Touching Anger is " + touchingAnger);
            for (int x : touchingAnger) {
                averageAnger += x;
            }
            averageAnger /= m.touching.size();
            //System.out.println("The Average Anger is " + averageAnger);
            averageAnger *= Math.random();
            //System.out.println("The Average Anger is " + averageAnger);


            //Alliance method
            if ((averageAnger) < .8 && Main.turnCount < bigList.size() * 9) {

                //Initial changes
                Country h = m.alliance();
                for (Region x : m.regions) {
                    x.anger -= 2;
                }
                for (Region x : h.regions) {
                    x.anger -= 2;
                }
                //System.out.println(h);
                if (h == Main.player1 || h == Main.player2 || h == Main.player3 || h == Main.player4 || h == Main.player5 || h == Main.player6 || h == Main.player7 || h == Main.player8) {
                    acceptAlliance(m, h);
                }
                if (acceptAlliance.equals("true")) {
                    if (h == Main.player1 || h == Main.player2 || h == Main.player3 || h == Main.player4 || h == Main.player5 || h == Main.player6 || h == Main.player7 || h == Main.player8) {
                        //System.out.println("You accepted the alliance with " + m + "  They will take the reigns from here");
                        JOptionPane.showMessageDialog(null, "You accepted the alliance with " + m + "  They will take the reigns from here");
                    }
                    m.name = allianceGroups(m, h);
                    gobbly += "\r\n" + mTempName + " strength " + m.strength + " is allying with " + h.name + " strength " + h.strength + ". They are now considered " + m.name + " strength " + (m.strength + h.strength);
                    //System.out.println(gobbly);
                    //System.out.println("Press return to continue");
                    //scanner.nextLine();
                    m.regions.addAll(h.regions);
                    //Indeces
                    int a = bigList.indexOf(m);
                    int b = bigList.indexOf(h);

                    //Sets all angers[a] to angers[a] + anger[b]
                    for (Country x : bigList) {
                        if (x != m && x != h) {
                            x.anger.set(a, x.anger.get(a) + x.anger.get(b));
                        }
                    }

                    //Sets m's anger[a] against every country to anger[a] + anger[b]
                    if (m.anger.size() > h.anger.size()) {
                        for (int i = 0; i < h.anger.size(); i++) {
                            m.anger.set(i, m.anger.get(i) + h.anger.get(i));
                        }
                    }
                    if (m.anger.size() <= h.anger.size()) {
                        for (int i = 0; i < m.anger.size(); i++) {
                            m.anger.set(i, m.anger.get(i) + h.anger.get(i));
                        }
                    }
                    //removes from bigList
                    bigList.remove(b);
                    //removes from each country's anger
                    for (Country x : bigList) {
                        x.anger.remove(b);
                    }
                    //removes from each country's touching
                    for (Country x : bigList) {
                        if (x.touching.contains(h)) {
                            //System.out.println(x.indexOf(p));
                            x.touching.remove(h);
                        }
                    }
                }
                //System.out.println(m.regions);
                //System.out.println(h.regions);
            }

            //Attack method
            else {
                if (m.strength < 50 * m.regions.size()) {
                    revolt();
                }
                //System.out.println(m + " is touching " + m.touching);
                Country p = m.defendingForce();
                for (Region x : m.regions) {
                    x.anger += 1;
                }
                for (Region x : p.regions) {
                    x.anger += 1;
                }
                //System.out.println(p);
                ArrayList<Region> rawRegions = new ArrayList<>();
                for (Region x : m.regions) {
                    rawRegions.addAll(x.touching);
                }
                rawRegions = removeDuplicatesR(rawRegions);
                ArrayList<Region> onlyInvadedNationRegions = new ArrayList<>();
                //System.out.println();
                //System.out.println("Raw Regions are" + "\n\r" + rawRegions);
                //System.out.println();
                //System.out.println(p + "'s regions are " + p.regions);
                for (Region x : rawRegions) {
                    if (p.regions.size() < 1) {
                        System.out.println("There is a problem with p's regions");
                    }
                    if (rawRegions.size() < 1) {
                        System.out.println("There is a problem with rawRegions");
                    }

                    if (p.regions.contains(x)) {
                        onlyInvadedNationRegions.add(x);
                    }
                }
                Region invadedRegion = onlyInvadedNationRegions.get((int) (Math.random() * onlyInvadedNationRegions.size()));
                gobbly += "\r\n" + m.name + " strength " + m.strength + " is attacking " + p.name + " strength " + p.strength + " at " + invadedRegion + ".";
                //System.out.println(gobbly);
                //System.out.println();
                //System.out.println("Press return to continue");
                //scanner.nextLine();
                int surroundingTroops = 0;
                for (Region x : m.regions) {
                    if (invadedRegion.touching.contains(x)) {
                        surroundingTroops += x.strength;
                    }
                }
                int aggressor = (int) (Math.random() * surroundingTroops);
                int defender = (int) (Math.random() * (invadedRegion.strength + invadedRegion.dStrength));
                gobbly += "\r\n" + m + " had " + aggressor + "\r\n" + p + " had " + defender + "\r\n";
                int a = 0;
                int b = 0;
                for (int i = 0; i < bigList.size(); i++) {
                    if (m == bigList.get(i)) {
                        a = i;
                    }
                    if (p == bigList.get(i)) {
                        b = i;
                    }
                }

                if (aggressor > defender) {
                    for (Region x : m.regions) {
                        if (x.anger > 0) {
                            x.anger -= 3;
                        }
                    }
                    invadedRegion.strength = (int) (invadedRegion.strength * Math.random());
                    invadedRegion.anger += 1;
                    m.regions.add(invadedRegion);
                    p.regions.remove(invadedRegion);
                    m.anger.set(b, m.anger.get(b) * 2);
                    p.anger.set(a, p.anger.get(a) * 2);
                    if (p.regions.size() < 1) {
                        bigList.remove(b);
                        for (Country x : bigList) {
                            x.anger.remove(b);
                            if (x.touching.contains(p)) {
                                x.touching.remove(p);
                            }
                        }
                        if ((p == Main.player1 || p == Main.player2 || p == Main.player3 || p == Main.player4 || p == Main.player5 || p == Main.player6 || p == Main.player7 || p == Main.player8)) {
                            double lp = (Math.random() * 4);
                            String lpp;
                            if (lp < 1) {
                                lpp = "eastern";
                            } else if (lp < 2) {
                                lpp = "western";
                            } else if (lp < 3) {
                                lpp = "southern";
                            } else {
                                lpp = "northern";
                            }
                            Region r = m.regions.get((int) (Math.random() * m.regions.size()));
                            gobbly += "\r\n" + p + " has been destroyed. You have been sent to a POW camp in " + lpp + " " + r + " and you country has become a puppet state of " + m + ". Now you must watch as your people suffer and you home falls to ruin.";
                            //System.out.println();
                        }
                        if ((p != Main.player1 || p != Main.player2 || p != Main.player3 || p != Main.player4 || p != Main.player5 || p != Main.player6 || p != Main.player7 || p != Main.player8)) {
                            gobbly += "\r\n" + p + " has fallen to " + m;
                        }
                    }
                    m.strength += invadedRegion.strength;
                    gobbly += "\r\n" + m + " successfully invaded " + invadedRegion + ". " + m + "'s new strength is " + m.strength;
                    //System.out.println(gobbly);
                }
                if (aggressor <= defender) {
                    for (Region x : m.regions) {
                        x.anger += 10;
                    }

                    for (Region x : m.regions) {
                        if (invadedRegion.touching.contains(x)) {
                            x.strength = (int) (x.strength * Math.random());
                            x.anger += 10;
                        }
                    }

                    updateTouching();
                    m.anger.set(b, m.anger.get(b) * 2);
                    p.anger.set(a, p.anger.get(a) * 2);
                    gobbly += "\r\n" + p + " successfully defended " + invadedRegion + " from " + m + ". " + p + "'s current strength is " + p.strength + ". " + m + "'s new strength is " + m.strength;
                    //System.out.println(gobbly);
                    //System.out.println();
                }
                //System.out.println(m.regions);
                //System.out.println(p.regions);
            }
            while (Math.random() > .5) {
                m.maneuverTroopsBot();
            }
        }
            //Decrements Country's Revolt Count
            for(Country x : bigList){
                if(x.regions.size() == 1 && x.regions.get(0).revoltCount > 0){
                    x.regions.get(0).revoltCount -= .01;
                }
            }

            //Updates each country's strength
            for(Country x : bigList){
                int sum = 0;
                for(Region y : x.regions){
                    sum += y.strength;
                }
                x.strength = sum;
            }
        //Leaderboard Method
        ArrayList<Country> leaderBoard = bigList;
        for(int j = 0; j < leaderBoard.size() - 1; j++)
        {
            int maxIndex = j;
            for (int k = j + 1; k < leaderBoard.size(); k++)
            {
                if (leaderBoard.get(k).strength > leaderBoard.get(maxIndex).strength)
                {
                    maxIndex = k;
                }
            }
            Country temp = leaderBoard.get(j);
            leaderBoard.set(j, leaderBoard.get(maxIndex));
            leaderBoard.set(maxIndex, temp);
        }
        String leaderBoardString = "";
        for(int i = 0; i < leaderBoard.size(); i++) {
            leaderBoardString += (i+1) + ". " + leaderBoard.get(i).name + ": " + leaderBoard.get(i).strength + ". \n";
        }
        //System.out.println("The current leader board looks like: \n " + schehm);
        if(!Main.simBots){
            JOptionPane.showMessageDialog(null, gobbly);
            JOptionPane.showMessageDialog(null, leaderBoardString);
        }
        //System.out.println();
        for(Country x : bigList){
            //System.out.println(x + " owns " + x.regions);
            for(Region y : x.regions){
                y.strength = y.strength + 2;
            }
        }
        //System.out.println();
        //System.out.println("--------------------------------------------------------------------------------------");
        //System.out.println("--------------------------------------------------------------------------------------");
        //System.out.println("Press return to continue");
        //scanner.nextLine();
        updateTouching();
        /*for(Country x : bigList){
            System.out.println(x + " owns:");
            for(Region y : x.regions) {
                System.out.println(y + " strength " + y.strength);
            }
            System.out.println();
        }*/

    }
}
