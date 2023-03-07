export function fizzbuzz(number) {
    let value;
    if (number % 15 == 0) {
        value = "fizzbuzz";
    } else if (number % 5 == 0) {
        value = "buzz";
    } else if (number % 3 == 0) {
        value = "fizz";
    } else {
        value = number;
    }
    return value;
}