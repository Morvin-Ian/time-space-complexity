package factorial

fun allSubsets(nums: IntArray): List<List<Int>> {
    val subsets = mutableListOf<List<Int>>()
    backtrack(nums, 0, mutableListOf<Int>(), subsets)
    return subsets
}

fun backtrack(nums: IntArray, index: Int, currentSubset: MutableList<Int>, subsets: MutableList<List<Int>>) {
    if (index == nums.size) {
        // Add the current subset to the list of subsets
        subsets.add(ArrayList(currentSubset))
        return
    }

    // Include the current element in the subset and backtrack
    currentSubset.add(nums[index])
    backtrack(nums, index + 1, currentSubset, subsets)

    // Exclude the current element from the subset and backtrack
    currentSubset.removeAt(currentSubset.size - 1)
    backtrack(nums, index + 1, currentSubset, subsets)
}
