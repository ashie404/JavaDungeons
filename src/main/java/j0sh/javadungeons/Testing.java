package j0sh.javadungeons;

import com.github.javafaker.Faker;

public class Testing {

    public static void main(String[] args) {
        Faker faker = new Faker(Rands.getRandom());

        boolean married = Rands.chance(10);

        Spouse spouse = Spouse.Builder.builder()
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .married(married)
                .marriedYears(married ? Rands.randIntRange(1, 60) : 0)
                .make();

        Relationship relationship = new Relationship(spouse);

        Person person = Person.Builder.builder()
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .prefix(faker.name().prefix())
                .relationship(relationship)
                .create();


//        for(int i = 0; i < 100; i++) {
//            System.out.println(String.format("Name: %s \nFirst Name: %s \nLast Name: %s \n\n", faker.name().fullName(), faker.name().firstName(), faker.name().lastName()));
//        }
    }

    public static void materialDebug(Person material) {
        String text =
                "\n\nTechnical Material Information" +
                        "\n##########################" +
                        "\nName : " + material.getName() +
                        "\nGenerate in : " + material.getOreInformation().getTargetId().toString() +
                        "\nOre Type : " + material.getOreInformation().getOreType().name().toLowerCase() +
                        "\n\nMaterial Design Information" +
                        "\n##########################" +
                        "\nMaterial Color : " + color.getRed() + "," + color.getGreen() + "," + color.getBlue() +
                        "\nOverlay Texture : " + material.getTexturesInformation().getOverlayTexture().toString() +
                        "\nResource Item Texture : " + material.getTexturesInformation().getResourceItemTexture().toString() +
                        "\nHas Armor : " + material.hasArmor() +
                        "\nHas Weapons : " + material.hasWeapons() +
                        "\nHas Tools : " + material.hasTools() +
                        "\nIs Glowing : " + material.isGlowing() +
                        "\nHas Ore Flower : " + material.hasOreFlower() +
                        "\nHas Food : " + material.hasFood() + "\n";
        System.out.println(text);
    }

}
