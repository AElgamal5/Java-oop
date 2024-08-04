package AElgamal5;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.EnumMap;

public class App {
    public static void main(String[] args) {
        /*
         * - Enum (short for enumeration) is a special data type that enables for a
         * variable to be a set of predefined constants.
         * 
         * - Enum is special class used to define a group of constants.
         * 
         * - Enum can be defined within or outside the class but not inside a method.
         *
         * - Each constant is implicitly public, static, and final.
         *
         * - It is recommended to use enum when a variable has a fixed set of values.
         *
         * - The enum constants are implicitly static and can be accessed using the
         * enum name.
         *
         * - Enums constants naming convention is all caps and should be separated by
         * underscore if more than one word.
         *
         * - Enums can also have fields, constructors, and methods.
         * 
         * - In java any enums inherit from java.Enum abstract class so that any enum
         * can't inherit form any class or another enum but can implement interfaces.
         * 
         * - Enums can have abstract methods but must be implemented in each object
         * using anonymous inner class.
         * 
         * - Enum built-in methods:
         * - ordinal(): return index of enum constant.
         * - compareTo(): compare between two enums constanta according to ordinal().
         * - toString(): return string representation of enum constant.
         * - name(): return name of enum constant as string.
         * - valueOf(): return enum constant according to the string passed as argument.
         * - values(): return array of enum constants.
         * 
         * - EnumSet: is a specialized Set implementation for use with enum types. It is
         * highly efficient because it uses a bit-vector representation internally.
         * 
         * EnumMap is a specialized Map implementation for use with enum types as keys.
         * It is also highly efficient because it uses an array internally.
         * 
         * - We can declare the main method inside enum class.
         */

        // use normal enums
        Days today = Days.SATURDAY;
        switch (today) {
            case SUNDAY:
                System.out.println("Sundays are tough.");
                break;
            case FRIDAY:
            case SATURDAY:
                System.out.println("Weekends are the best!");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
        System.out.println("-".repeat(20));

        // use enums with fields and methods
        DaysWithAbbreviation day = DaysWithAbbreviation.SATURDAY;
        System.out.println(day.getAbbreviation());
        day.setAbbreviation("Sat-updated");
        System.out.println(day.getAbbreviation());
        System.out.println("-".repeat(20));

        // use enums with abstract methods
        Numbers number = Numbers.ONE;
        number.print();
        System.out.println("-".repeat(20));

        // more examples
        Order o1 = new Order();
        System.out.println(o1.getStatus());
        o1.setStatus(OrderStatus.PROCESSING);
        System.out.println(o1.getStatus());
        System.out.println("-".repeat(20));

        // enum built-in methods
        System.out.println(OrderStatus.PENDING.ordinal()); // 0
        System.out.println(OrderStatus.SHIPPED.ordinal()); // 2

        System.out.println(OrderStatus.PROCESSING.compareTo(OrderStatus.SHIPPED)); // -1 -> negative -> less than
        System.out.println(OrderStatus.PROCESSING.compareTo(OrderStatus.PROCESSING)); // 0 -> equal
        System.out.println(OrderStatus.PROCESSING.compareTo(OrderStatus.PENDING)); // 1 -> positive -> greater than

        System.out.println(OrderStatus.PENDING.toString()); // "PENDING"
        System.out.println(OrderStatus.PENDING.toString().equals("PENDING")); // true

        System.out.println(OrderStatus.PROCESSING.name()); // "PROCESSING"
        System.out.println(OrderStatus.PROCESSING.name().equals("PROCESSING")); // true

        System.out.println(OrderStatus.valueOf("SHIPPED")); // SHIPPED
        System.out.println(OrderStatus.valueOf("SHIPPED").compareTo(OrderStatus.SHIPPED)); // 0 -> equals

        for (OrderStatus status : OrderStatus.values()) {
            System.out.println(status.name());
        }
        System.out.println(Arrays.toString(Days.values()));
        System.out.println("-".repeat(20));

        // using EnumSet
        EnumSet<Days> weekDays = EnumSet.allOf(Days.class);
        System.out.println(weekDays); // [SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY]
        EnumSet<Days> weekEnds = EnumSet.of(Days.FRIDAY, Days.SATURDAY);
        System.out.println(weekEnds); // [SATURDAY, FRIDAY]
        EnumSet<Days> workDays = EnumSet.range(Days.SUNDAY, Days.THURSDAY);
        System.out.println(workDays); // [SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY]

        EnumSet<Days> someDays = EnumSet.noneOf(Days.class);
        System.out.println(someDays); // []
        someDays.add(Days.FRIDAY);
        someDays.add(Days.FRIDAY); // no repetition in the set
        System.out.println(someDays); // [FRIDAY]
        someDays.add(Days.WEDNESDAY);
        System.out.println(someDays); // [WEDNESDAY, FRIDAY]
        someDays.addAll(weekEnds);
        System.out.println(someDays); // [SATURDAY, WEDNESDAY, FRIDAY]
        someDays.removeAll(weekEnds);
        System.out.println(someDays); // [WEDNESDAY]
        someDays.remove(Days.WEDNESDAY);
        System.out.println(someDays); // []
        System.out.println("-".repeat(20));

        // using EnumMap
        EnumMap<Days, String> daysDescription = new EnumMap<>(Days.class);

        daysDescription.put(Days.SUNDAY, "Start of the work week");
        daysDescription.put(Days.THURSDAY, "End of the work week");
        daysDescription.put(Days.FRIDAY, "Weekend!");

        for (Days d : Days.values()) {
            System.out.println(d + ": " + daysDescription.get(d));
        }
    }
}
