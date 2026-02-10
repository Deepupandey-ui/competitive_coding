Q1--> 1.Two Sum :

Q2.Integer to Roman :

Q3.Maximum Odd Binary Number
   Explaination: this problem based on two pointer

Q4. Slow and Fast Pointers use and Problems:-->

  Explaination :-->>
  Note:- Where do we use slow–fast pointer?
   ✔ Detect cycle
   ✔ Find start of cycle
   ✔ Find middle node
   ✔ Check palindrome in linked list
   ✔ Remove cycle
   ✔ Reorder list 

    1--> for detection cycle :- 141. Linked List Cycle
    2--> Find middle node :- 876. Middle of the Linked List
    3-->234. Palindrome Linked List
      explaination: 3 step of this problem 
         1.find middle of LL
         2.second half reverse
         3.check first half and second half
    4--> 142. Linked List Cycle II
        explaination : 
          1. slow.next and fast.next.next;
            if slow equal fast then break;
          2. if fast equal null or fast.next equal null then return null;
          3. slow = head;
             loop till when slow equal fast then return slow ;   

               
               