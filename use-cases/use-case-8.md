# USE CASE: 8 Delete an Employees Details

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *HR advisor* I want *to delete an employee's details* so that *the company is compliant with data retention legislation.*

### Scope

Company.

### Level

Primary task.

### Preconditions

We know the employee number.  Database contains employee data.

### Success End Condition

Employee information is deleted.

### Failed End Condition

Employees information is not deleted.

### Primary Actor

HR Advisor.

### Trigger

A request to deleted employee information is sent to HR.

## MAIN SUCCESS SCENARIO

1. Request for deletion of employee information.
2. HR advisor captures employee number of the employee to delete.
3. HR advisor deletes employee information of the given employee.
4. HR advisor confirms removal of employee information.

## EXTENSIONS

2. **Employee does not exist**:
    1. HR advisor informs no employee exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
