package Lesson9;

public class Village {

    private Building[] buildings = new Building[1];

    public void addBuilding(Building building) {
        {
            int count = 0;
            for (int i = 0; i < buildings.length; i++) {
                count++;
            }

            Building[] newBuildings = new Building[count + 1];
            for (int i = 0; i < count; i++) {
                newBuildings[i] = buildings[i];
            }
            newBuildings[count] = building;
            buildings = newBuildings;

        }

    }

    public void info1() {
        for (Building building1 : buildings) {
            if (building1 != null) {
                System.out.println(building1.info());
            }
        }
    }

}
