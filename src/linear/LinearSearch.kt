package linear

fun <T>linearSearch(value:Int, array: Array<T>):Int?{
    for( index in 0..array.lastIndex){
        if (array[index] == value){
            return index
        }else{
            continue
        }
    }

    return null
}