import spock.lang.Specification
import spock.lang.Unroll

class TestableSpec extends Specification {
  
  @Unroll
  def 'getName should return whatever name is given'() {
    given: 'create testable instance'
    Testable testable = new Testable()
    
    when:
    String result = testable.getName(inputName)
    
    then:
    result == expectedResult
    
    where:
    inputName || expectedResult
    "Serdar"  || "Serdar"
    "John"    || "John"
    "doe"     || "doe"
  }
  
  @Unroll
  def 'multiplyIntegers should return mutiplied integers'() {
    given:
    Testable testable = new Testable()
    
    when:
    Integer result = testable.multiplyIntegers(inputFirstInteger, inputSecondInteger)
    
    then:
    result == expectedResult
    
    where:
    inputFirstInteger | inputSecondInteger || expectedResult
    2                 | 3                  || 6
    0                 | 1                  || 0
    1                 | 0                  || 0
    30                | 30                 || 900
  }
  
  @Unroll
  def 'mockFunction should return mocked value'() {
    given: 'assign a value to the mockFunction'
    Testable mockTestable = GroovyMock(Testable)
    mockTestable.mockFunction(_) >> inputMockValue
    
    when: 'call mockFunction with any parameter and should return inputMockValue'
    Integer result = mockTestable.mockFunction(null)
    
    then: 'result should always equal to the inputMockValue'
    result == expectedResult
    
    where:
    inputMockValue || expectedResult
    2              || 2
    100            || 100
    -99            || -99
  }
}
