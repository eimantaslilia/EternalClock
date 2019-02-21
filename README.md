# EternalClock

My first program using classes. We create the class BoundedCounter which is defined by having the starting number, and the ending number.
We create several methods to help us:
1. next() helps us advance the starting number by one.
2. getValue() returns the current value of the starting number.
3. setValue() lets us set the value of the starting number.

The user is asked to enter hours, minutes and seconds, one by one. Once the numbers are entered, the clock starts, counting each second.
Then once the seconds reach 59, minutes are incremented by one, and the clock starts to count seconds from 0 again. When minutes reach 59 - hours
are incremented by one, and so on.
