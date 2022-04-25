import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextTest {
    @Test
    public void testLocation(){
        Thing yellowPebbles = new Thing("галька");
        yellowPebbles.setColor(new Color("жёлтый"));
        Thing greenPebbles = new Thing("галька");
        greenPebbles.setColor(new Color("зелёный"));
        Place beach = new Place("пляж");
        Locate locateYellowPebbles = new Locate(beach, yellowPebbles);
        Locate locateGreenPebbles = new Locate(beach, greenPebbles);
        assertTrue(beach.getThings().contains(greenPebbles));
        assertEquals(yellowPebbles.getPlace(), beach);
    }

    @Test
    public void testConnection(){
        Place beach = new Place("пляж");
        Place sea = new Place("море");
        Place mountains = new Place("горы");
        ConnectedPlaces connections = new ConnectedPlaces();
        connections.addConnection(beach, sea);
        connections.addConnection(sea, mountains);
        assertTrue(connections.getConnectedPlaces(sea).contains(mountains));
        assertFalse(connections.getConnectedPlaces(beach).contains(mountains));
    }

    @Test
    public void testColors() {
        Thing yellowPebbles = new Thing("галька");
        yellowPebbles.setColor(new Color("жёлтый"));
        Thing greenPebbles = new Thing("галька");
        greenPebbles.setColor(new Color("зелёный"));
        Place beach = new Place("пляж");
        Locate locateYellowPebbles = new Locate(beach, yellowPebbles);
        Locate locateGreenPebbles = new Locate(beach, greenPebbles);
        beach.getThings().forEach(thing -> {
            assertTrue(thing.getColor().getColorName().equals("жёлтый") || thing.getColor().getColorName().equals("зелёный") );
        });
        assertEquals(beach.getThings().size(), 2);
    }

    @Test
    public void testMaterial() {
        Thing table = new Thing("столик");
        Thing tassels = new Thing("кисти");
        Material silver = new Material("серебро");
        tassels.setMaterial(new Material("серебро"));
        table.setMaterial(silver);
        assertEquals(table.getMaterial(), tassels.getMaterial());
    }
}
