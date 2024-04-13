package logarithimic



// Array is already sorted
fun binarySearch(value:Int, array: IntArray):Int?{
    var low = 0
    var high = array.lastIndex
    var midpoint = (low + high)/2

    while (low <= midpoint){
        midpoint = (low + high)/2
        if (array[midpoint] == value){
            return midpoint
        }else if(array[midpoint] < value){
            low = midpoint + 1
        }else{
            high = midpoint- 1
        }
    }

    return null
}