fun main() {
    solution(2)
}


fun solution(N: Int): Int {
    var binary=computeBinary(N);
    var maxGap=maxGap(binary)
    return maxGap;
}

fun maxGap(s: String): Int {
    var maxGap = 0
    var countZeros = false
    var currentGap = 0
    for (ch in s) {
        if (ch == '1') {
            if (countZeros) {
                countZeros = false
                maxGap = Math.max(maxGap, currentGap)
                currentGap=0;
            }
            countZeros = true
        } else {
            if (countZeros) {
                currentGap++
            }
        }
    }

    return maxGap;
}


fun computeBinary(a: Int): String {
    var binary = ""
    var num = a;
    while (num > 0) {
        binary = (num % 2).toString() + binary
        num /= 2
    }
    return binary
}