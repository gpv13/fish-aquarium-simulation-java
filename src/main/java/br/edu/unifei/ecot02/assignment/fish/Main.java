package br.edu.unifei.ecot02.assignment.fish;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- START SIMULATION ---");


        Shop bahiasHouse = Shop.getInstance();
        bahiasHouse.setPrice(999f); 

        Ocean blueOcean = Ocean.getInstance(); 
        System.out.println("\n[SETUP] Shop 'Bahias House' is open.");
        System.out.println("[SETUP] Blue Ocean is known."); 


        CageSpecialist jones = new CageSpecialist();
        AquariumSpecialist mary = new AquariumSpecialist();
        PondSpecialist peter = new PondSpecialist();

        Cage c = jones.buildStructure();
        System.out.println("\n[ENGINEERS] Dr. Jones built a Cage (Structures built: " + jones.getStructuresBuilt() + ").");

        Aquarium aq = mary.buildStructure();
        System.out.println("[ENGINEERS] Mary built an Aquarium (Structures built: " + mary.getStructuresBuilt() + ").");

        FishPond fp = peter.buildStructure();
        System.out.println("[ENGINEERS] Peter built a Fish Pond (Structures built: " + peter.getStructuresBuilt() + ").");


        SaltWaterFish nemo = new SaltWaterFish();
        nemo.setSpecies("ClownFish");
        nemo.setPrice(100.0f);
        nemo.setStrongColors(true);
        nemo.setSize(5.0f);
        System.out.println("\n[FISH] Clownfish Nemo created.");

        SaltWaterFish marlin = new SaltWaterFish();
        marlin.setSpecies("Marlin");
        marlin.setPrice(150.0f);
        marlin.setStrongColors(false);
        marlin.setSize(10.0f);
        System.out.println("[FISH] Marlin created.");

        FreshWaterFish betta = new FreshWaterFish();
        betta.setSpecies("Betta");
        betta.setPrice(50.0f);
        betta.setEdible(false);
        betta.setSize(3.0f);
        System.out.println("[FISH] Betta created.");

        FreshWaterFish tilapia = new FreshWaterFish();
        tilapia.setSpecies("Tilapia");
        tilapia.setPrice(80.0f);
        tilapia.setEdible(true);
        tilapia.setSize(7.0f);
        System.out.println("[FISH] Tilapia created."); 


        c.getFish().add(nemo);
        c.getFish().add(marlin);
        System.out.println("\n[POPULATION] " + c.getFish().size() + " fish added to the Cage.");

        aq.getFish().add(betta);
        aq.getFish().add(betta);
        aq.getFish().add(nemo);
        System.out.println("[POPULATION] " + aq.getFish().size() + " fish added to the Aquarium.");

        fp.getFish().add(betta);
        fp.getFish().add(tilapia);
        System.out.println("[POPULATION] " + fp.getFish().size() + " fish added to the Fish Pond.");



        Fisherman<SaltWaterFish> lewisOlmes = new Fisherman<>();
        lewisOlmes.setName("Lewis Olmes");
        lewisOlmes.setMoney(1500.0f);
        lewisOlmes.setWorkplace(c);
        System.out.println("\n[CHARACTER] " + lewisOlmes.getName() + " (Saltwater Fisherman) has $" + lewisOlmes.getMoney() + ".");


        Fisherman<FreshWaterFish> thatyana = new Fisherman<>();
        thatyana.setName("Thatyana");
        thatyana.setMoney(1200.0f);
        thatyana.setWorkplace(fp);
        System.out.println("[CHARACTER] " + thatyana.getName() + " (Freshwater Fisherwoman) has $" + thatyana.getMoney() + ".");



        System.out.println("\n--- FISHERMAN ACTIONS ---");
        System.out.println(lewisOlmes.getName() + " is going fishing...");
        lewisOlmes.goFishing(1);
        System.out.println("Lewis fished! Current money: $" + lewisOlmes.getMoney());
        System.out.println("Fish in the Cage now: " + c.getFish().size());


        System.out.println("\n" + thatyana.getName() + " is going fishing...");
        thatyana.goFishing(1);
        System.out.println("Thatyana fished! Current money: $" + thatyana.getMoney());
        System.out.println("Fish in the Fish Pond now: " + fp.getFish().size());


        System.out.println("\n--- SHOP PURCHASE ---");
        System.out.println(lewisOlmes.getName() + " tries to buy a rod upgrade. Price: $" + bahiasHouse.getPrice());
        
        bahiasHouse.buyUpgrade(lewisOlmes);
        System.out.println(lewisOlmes.getName() + "'s rod level now: " + lewisOlmes.getRodLevel());
        System.out.println(lewisOlmes.getName() + "'s money after purchase: $" + lewisOlmes.getMoney());

        System.out.println("\n" + lewisOlmes.getName() + " fishes again with the upgraded rod (x" + lewisOlmes.getRodLevel() + " profit!)...");
        lewisOlmes.goFishing(1);
        System.out.println("Lewis fished again! Current money: $" + lewisOlmes.getMoney());



        FishCaretaker enzo = new FishCaretaker();
        enzo.setName("Enzo");
        System.out.println("\n--- FISH CARETAKER ACTIONS ---");

        System.out.println("\n" + enzo.getName() + " (fish caretaker) tries to feed the Aquarium with Freshwater Flakes (for FreshwaterFish).");

        boolean fedAq = enzo.feedWithFlakes(aq);
        System.out.println("Was the Aquarium fed with Freshwater Flakes? " + fedAq);

        if (fedAq) {
            System.out.println("New number of fish in the Aquarium: " + aq.getFish().size() + " (A fish reproduced due to food!)");
        } else {
             System.out.println("Number of fish in the Aquarium: " + aq.getFish().size());
        }
       
        System.out.println("\n" + enzo.getName() + " tries to feed the Cage (only SaltWaterFish) with Freshwater Flakes.");

        boolean fedCageWithFlakes = enzo.feedWithFlakes(c); 
        System.out.println("Was the Cage fed with Freshwater Flakes? " + fedCageWithFlakes);
        System.out.println("Number of fish in the Cage: " + c.getFish().size());


        System.out.println("\n" + enzo.getName() + " tries to feed the Cage (only SaltWaterFish) with Saltwater Pellets.");
        fedCageWithFlakes = enzo.feedWithPellets(c);
        System.out.println("Was the Cage fed with Saltwater Pellets? " + fedCageWithFlakes);
        if (fedCageWithFlakes) {
            System.out.println("New number of fish in the Cage: " + c.getFish().size() + " (A fish reproduced due to food!)");
        }


        System.out.println("\n" + enzo.getName() + " tries to feed the Fish Pond (only FreshwaterFish) with Algae.");

        boolean fedPondWithAlgae = enzo.feedWithAlgae(fp);
        System.out.println("Was the Fish Pond fed with Algae? " + fedPondWithAlgae);
        if (fedPondWithAlgae) {
            System.out.println("New number of fish in the Fish Pond: " + fp.getFish().size() + " (A fish reproduced due to food!)");
        }


        System.out.println("\n--- OCEAN ACTION ---");
        System.out.println(enzo.getName() + " tries to feed the Blue Ocean with Freshwater Flakes.");

        boolean fedOceanWithFreshwaterFlakes = enzo.feedWithFlakes(blueOcean);
        System.out.println("Was the Ocean fed with Freshwater Flakes? " + fedOceanWithFreshwaterFlakes);
        System.out.println("Fish in the Ocean now: " + blueOcean.getFish().size() + " (No reproduction expected with wrong food.)");

        System.out.println("\n" + enzo.getName() + " tries to feed the Blue Ocean with Saltwater Pellets.");
        boolean fedOceanWithSaltwaterPellets = enzo.feedWithPellets(blueOcean);
        System.out.println("Was the Ocean fed with Saltwater Pellets? " + fedOceanWithSaltwaterPellets);
        if (fedOceanWithSaltwaterPellets) {
            System.out.println("New number of fish in the Ocean: " + blueOcean.getFish().size() + " (A fish might have reproduced due to food!)");
        } else {
            System.out.println("Fish in the Ocean now: " + blueOcean.getFish().size());
        }


        System.out.println("\n--- END SIMULATION ---");
    }
}