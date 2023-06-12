class Solution:
      def summaryRanges(self, nums):

        l=[]
        diff=0
        start=0
        if (len(nums)==1):
                l.append(str(nums[0]))

        for i in range(len(nums)-1):
            diff=nums[i+1]-nums[i]
            if diff!=1:
                l.append("{}->{}".format(nums[start],nums[i])) if start!=i else l.append(str(nums[i]))
                start=i+1

            if ((i+1)==(len(nums)-1)):
                l.append("{}->{}".format(nums[start],nums[i+1])) if start!=i+1 else l.append(str(nums[i+1]))
               
            
            
        return l