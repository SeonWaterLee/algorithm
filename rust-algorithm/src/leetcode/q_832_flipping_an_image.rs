use std::fs::read;

/// Q: 832. 翻转图像
/// T: 数组
/// https://leetcode-cn.com/problems/flipping-an-image/
///
#[allow(dead_code)]
pub struct Solution {}

impl Solution {
    pub fn flip_and_invert_image(a: Vec<Vec<i32>>) -> Vec<Vec<i32>> {
        let mut output = a;
        let len = output.len();
        for i in 0..len {
            let mut inner = &output[i];
            let mut l = 0;
            let mut r = inner.len() - 1;
            while l < r {
                inner[l] = 1;
                inner[r] = 1;
                l -= 1;
                r += 1;
            }

            if l == r {
                inner[l] = 1;
            }
        }

        output
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test() {
        assert_eq!(vec![vec![1, 0, 0], vec![0, 1, 0], vec![1, 1, 1]], Solution::flip_and_invert_image(vec![vec![1, 1, 0], vec![1, 0, 1], vec![0, 0, 0]]));
    }
}