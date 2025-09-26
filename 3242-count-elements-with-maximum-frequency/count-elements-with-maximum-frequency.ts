function maxFrequencyElements(nums: number[]): number {
    let max = 0;
    let result = 0;
    const frequencies = new Map();

    nums.forEach(item => {
        frequencies.set(item, (frequencies.get(item) || 0) + 1);
    });

    max = Math.max(...frequencies.values());

    nums.forEach(item => {
        if (frequencies.get(item) === max) {
            result++
        }
    });
    return result
};