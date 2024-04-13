package constant

fun <T>getElement(index:Int, array: Array<T>):T?{
    if(index < 0 || index >= array.size) {
        return null;
    } else {
        return array[index];
    }
}