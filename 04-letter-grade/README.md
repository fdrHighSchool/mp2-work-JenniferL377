# Letter Grade
#### Respond to the following:

1. Write a plan for the following extension:
  * Attach a "+" on their grade if the grade ends in a 7, 8 or 9 (eg: 78 -> C+, 89 -> B+)
  * Attach a "-" on their grade if the grade ends in a 0, 1 or 2 (eg: 92 -> A-, 61 -> D-)

    * add separate ifs with System.out.print +or- if grade%10 end in the numbers


2. Discuss how you would make sure 100 is not misrepresented as an A-.
  * if grade==100 print "+"


3. Discuss how you would make sure grades that are an F are not mislabeled as F- or F+ (eg: 49 -> F+ and 52 -> F-)
  * only apply the -or+ above when grade>=60
