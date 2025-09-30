# USE CASE: 6 View an Employees Details

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *HR advisor* I want *to view an employee's details* so that *the employee's promotion request can be supported.*

### Scope

Company.

### Level

Primary task.

### Preconditions

We know the employee number.  Database contains employee data.

### Success End Condition

A report is available for HR.

### Failed End Condition

No report is produced.

### Primary Actor

HR Advisor.

### Trigger

A request for employee information is sent to HR.

## MAIN SUCCESS SCENARIO

1. Request for employee information.
2. HR advisor captures employee number of the employee to get information for.
3. HR advisor extracts employee information of the given employee.
4. HR advisor provides information.

## EXTENSIONS

2. **Employee does not exist**:
    1. HR advisor informs no employee exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
