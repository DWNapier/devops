# USE CASE: 3 Produce a Report on the Salary of Employees of a Given Department

## CHARACTERISTIC INFORMATION

### Goal in Context

As a *department manager* I want *to produce a report on the salary of employees in my department* so that *I can support financial reporting for my department.*

### Scope

Company.

### Level

Primary task.

### Preconditions

We know the Department Managers department.  Database contains current employee salary data.

### Success End Condition

A report is available for Department Manager to provide to finance.

### Failed End Condition

No report is produced.

### Primary Actor

Department Manager.

### Trigger

A request for finance information is sent to Department Manager.

## MAIN SUCCESS SCENARIO

1. Finance request salary information for a given department.
2. Department Manager captures name of the department to get salary information for.
3. Department Manager extracts current salary information of all employees of their department.
4. Department Manager provides report to finance.

## EXTENSIONS

2. **Primary actor is not the current manager of requested department**:
    1. Department Manager informs finance they are not the manager of the requested department.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
