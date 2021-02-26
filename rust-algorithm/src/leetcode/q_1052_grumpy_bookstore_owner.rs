use std::cmp::max;

/// Q: 1052. 爱生气的书店老板
/// T: 数组、 滑动窗口
/// https://leetcode-cn.com/problems/grumpy-bookstore-owner/

#[allow(dead_code)]
pub struct Solution {}

impl Solution {
    pub fn max_satisfied(customers: Vec<i32>, grumpy: Vec<i32>, x: i32) -> i32 {
        let x = x as usize;
        let mut base: i32 = 0;

        for (i, b) in grumpy.iter().enumerate() {
            if b.eq(&0) {
                base += customers.get(i).unwrap()
            }
        }

        let mut max_increase = 0;
        let mut increase = 0;
        for (i, v) in customers.iter().enumerate() {
            if i < x {
                increase += v * grumpy.get(i).unwrap();
                if i == x - 1 {
                    max_increase = increase;
                }
            } else {
                let ii = i - x;
                increase = increase + v * grumpy.get(i).unwrap() - customers.get(ii).unwrap() * grumpy.get(ii).unwrap();
                max_increase = max(max_increase, increase);
            }
        }

        base + max_increase
    }
}


#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test() {
        assert_eq!(
            16,
            Solution::max_satisfied(
                vec![1, 0, 1, 2, 1, 1, 7, 5],
                vec![0, 1, 0, 1, 0, 1, 0, 1],
                3,
            )
        );
    }
}
