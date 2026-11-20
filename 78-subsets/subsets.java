class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, 0, nums.length, result, new ArrayList<>());
        return result;
    }

    private static void helper(int[] nums, int index, int n, List<List<Integer>> result, List<Integer> current) {
        if (index == n) {
            result.add(new ArrayList<>(current));
            return;
        }

        helper(nums, index + 1, n, result, current);

        current.add(nums[index]);
        helper(nums, index + 1, n, result, current);
        current.remove(current.size() - 1);
    }
}