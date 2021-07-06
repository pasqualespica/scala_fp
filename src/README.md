## Github ref repo
https://github.com/rockthejvm/scala-beginners

### Takeaways 

#### Variables
- prefer `vals` over `vars`
- all `vals` and `vars` have `types`
- compiler automatically infers types when omitted
- basic types
    - `Boolean`
    - `Int` `Long` `Double`
    - `String`

#### Expressions
- Basic expressions : operator
- `If` in Scala is an expression
- Code block in Scala are expressions
- Expressions vs instructions
    - instructions are executed (think Java), expressions are evaluated (Scala)
    - in Scala we'll this in terms of expressions
    
#### Function _Call by_ 
- value 
  - value is computed before call
  - same value used everywhere 
- name
  - expression is passed literally
  - expression is evaluated at every use within
  
#### Classes 
- Define classes `class` keyword
- Instantiang `new`
- Parameters vs fields ( using `val` or `var` before nDame parameter)
- Define methods
- Calling methods

#### Method Notations
- infix : _object method parameter_ `mary like "Film`
- prefix : `!mary` equivalent to `mary.unary_!` ( only allowed for `+,-,!,~`)
- postfix : `mary.isAlive` or `mary isAlive` ( for methods with NO parameters )
- `apply` : special method to `mary("Hello")` equivalent to `mary.apply("Hello")` 

#### Object
- Scala doesn't have `static` values\methods
- objects
  - are in their own class
  - are the only instance
  - singleton pattern in one line
- companions ( object + class ) 
  - can access each other's private members
  - Scala is more OO than JAVA !
- applications
  - `def main(args: Array[String]): Unit`

#### Traits
  - traits do not have constructor parameters
  - multiple traits may be  inherited by the same class
  - traits = behavior, abstract class = "thing"
