#Given a string s consisting of words and spaces, return the length of the last word in the string.

#A word is a maximal 
#substring
#consisting of non-space characters only.

class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        s = s.split()
        s = s[-1]
        return len(s)
        