package string

class LongestSubstring {
    fun lengthOfLongestSubstring(s: String): Int {
        var longestSubString = 0;
        if (s.length == 0) return 0
        if (s.length == 1) return 1
        for (i in 0..s.length - 1) {
            var hashMap: MutableMap<Char, Int> = mutableMapOf()
            var count = 0
            hashMap.put(s[i], 1)
            for (j in (i+1)..s.length - 1) {
                if (hashMap.containsKey(s[j])) {
                    break
                } else {
                    count++
                    hashMap.put(s[j], 1)
                }
            }
            if (hashMap.size > longestSubString) {
                longestSubString = hashMap.size
            }
        }
        return longestSubString;

    }
}