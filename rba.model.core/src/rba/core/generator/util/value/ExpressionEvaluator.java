package rba.core.generator.util.value;

import rba.core.Expression;
import rba.core.ExpressionType;
import rba.core.generator.util.EObjectDecorator;

abstract public class ExpressionEvaluator<T> extends EObjectDecorator implements Expression {

    private Expression expression;

    protected ExpressionEvaluator(Expression o) {
        super(o);
        expression = o;
    }

    @Override
    public ExpressionType getType() {
        return expression.getType();
    }

    @Override
    public boolean isSetType() {
        return expression.isSetType();
    }

    @Override
    public String getExpression() {
        return expression.getExpression();
    }

    @Override
    public void setExpression(String value) {
        expression.setExpression(value);
    }

    @Override
    public void unsetExpression() {
        expression.unsetExpression();
    }

    @Override
    public boolean isSetExpression() {
        return expression.isSetExpression();
    }

    @Override
    public String getExpressionText() {
        return expression.getExpressionText();
    }

    @Override
    public ExpressionType getUnderlyingType() {
        return expression.getUnderlyingType();
    }

}
