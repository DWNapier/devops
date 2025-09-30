# USE CASE: 7 Update an Employees Details

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *HR advisor* I want *to update an employee's details* so that *employee's details are kept up-to-date.*

### Scope

Company.

### Level

Primary task.

### Preconditions

We know the employee number.  Database contains employee data. We know the information changes required.

### Success End Condition

Employee information is updated.

### Failed End Condition

Employee information is not updated.

### Primary Actor

HR Advisor.

### Trigger

A request to update employee information is sent to HR.

## MAIN SUCCESS SCENARIO

1. Request to update employee information.
2. HR advisor captures employee number of the employee to get current information for.
3. HR advisor captures the information change required.
4. HR advisor updates the required employee information.

## EXTENSIONS

2. **Employee does not exist**:
    1. No information is updated.
3. **New information is not valid**:
    1. No information is updated.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
