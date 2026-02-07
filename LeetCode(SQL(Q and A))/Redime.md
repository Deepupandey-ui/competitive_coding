1321. Restaurant Growth :

Explaination of this problem:-

  🧠 Problem Idea (Short)
We need to calculate the 7-day moving total and 7-day moving average of customer spending.
The result for a day must include:
current day + previous 6 days

✅ Key Steps
First, combine all records of the same day
→ get daily total amount.
Sort the days by date.
For each day, use a sliding window of 7 rows
(current row + previous 6 rows).

Compute:
7-day sum
7-day average
Ignore the first 6 days (because a full 7-day window is not available).

⭐ Core SQL Concept
Use a window frame:
"ROWS BETWEEN 6 PRECEDING AND CURRENT ROW"
This creates the dynamic window:
1–7, 2–8, 3–9, ...

602. Friend Requests II: Who Has the Most Friends: 
 
 Expaination:
    Problem Understanding

Each row in RequestAccepted represents a friendship between two people:
(requester_id , accepter_id)
Friendship is bidirectional

So for every row:
requester_id gets one friend
accepter_id gets one friend

💡 Key Idea
We must count friends for both columns.
That means:
treat requester_id as a person
treat accepter_id as a person
put both into one list
Now we simply count how many times each person appears.

🪜 Step-by-step Logic
Take all values from requester_id.
Take all values from accepter_id.
Combine both lists into a single column of person IDs.
Count how many times each person appears.
The person with the highest count has the most friends.

185. Department Top Three Salaries:
  Explaination:-  🧠 Problem Idea--->>
We must find the top three highest salaries in each department.

Important point:
👉 The ranking must be done separately for every department,
not across the whole company.

✅ Key Observation
If we rank employees only by salary:
ORDER BY salary DESC
then all employees are mixed together.

But the problem asks:
Top 3 salaries per department.
So we must rank inside each department.

🪜 Step-by-step Logic
Join Employee and Department to get employee name and department name.
For every department, rank employees by salary (highest first).
Keep only the employees whose rank is:
1, 2 or 3

⭐ Core SQL Concept
We use a window function with partition:
DENSE_RANK()
OVER (
    PARTITION BY department
    ORDER BY salary DESC
)

PARTITION BY
→ restarts ranking for each department.
ORDER BY salary DESC
→ highest salary gets rank 1.
DENSE_RANK()
→ handles ties correctly (same salary → same rank).

🧩 Why a subquery is used
Because:
the rank is calculated first
and then we filter using that rank (<= 3)
Filtering on a window function result requires a subquery.

585. Investments in 2016