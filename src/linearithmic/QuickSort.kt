package linearithmic

private fun quickSort(list: MutableList<Int>, left: Int = 0, right: Int = list.lastIndex): List<Int> {
    fun pivot(list: MutableList<Int>, start: Int = 0, end: Int = list.lastIndex): Int {
        val pivot = list[start]
        var swapIndex = start

        (start + 1..end).forEach {
            if (pivot > list[it]) {
                swapIndex++
                list.swap(it, swapIndex)
            }
        }

        list.swap(start, swapIndex)

        return swapIndex
    }

    if (left < right) {
        val pivotIndex = pivot(list, left, right)

        // Sort left part
        quickSort(list, left, pivotIndex - 1)

        // Sort right part
        quickSort(list, pivotIndex + 1, right)
    }

    return list
}

private fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}