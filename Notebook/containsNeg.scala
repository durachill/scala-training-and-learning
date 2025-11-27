def containsNeg(nums: List[Int]): Boolean =
    var exists = false
    for num <- nums do
        if num < 0 then
            exists = true
    exists

// Снизу ПРАВИЛЬНАЯ версия, лакончиная

def containsNeglac(nums: List[Int]): Boolean = nums.exists(_ < 0)
