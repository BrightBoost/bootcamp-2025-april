package week5.hotelslowly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn() {
        // arrange
        Room room = new Room(2, 100, false, false);

        // act
        room.checkIn();

        // assert
        assertTrue(room.isDirty());
        assertTrue(room.isOccupied());
    }


    @Test
    void checkInToDirtyRoom_should_fail() {
        // arrange
        Room room = new Room(2, 100, false, true);

        // act
        room.checkIn();

        // assert
        assertFalse(room.isOccupied());
    }

    @Test
    void checkOut() {
        // arrange
        Room room = new Room(2, 100, true, true);

        // act
        room.checkOut();

        // assert
        assertFalse(room.isOccupied());
    }

    @Test
    void cleanRoom() {
        // arrange
        Room room = new Room(2, 100, false, true);

        // act
        room.cleanRoom();

        // assert
        assertFalse(room.isDirty());
    }
}