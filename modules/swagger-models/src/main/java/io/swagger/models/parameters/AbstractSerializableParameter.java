package io.swagger.models.parameters;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.models.properties.ArrayProperty;
import io.swagger.models.properties.Property;
import io.swagger.models.properties.StringProperty;

import java.util.List;

@JsonPropertyOrder({"name", "in", "description", "required", "type", "items", "collectionFormat", "default", "maximum", "exclusiveMaximum", "minimum", "exclusiveMinimum"})
public abstract class AbstractSerializableParameter<T extends AbstractSerializableParameter<T>> extends AbstractParameter implements SerializableParameter {
    protected String type;
    protected String format;
    protected String collectionFormat;
    protected Property items;
    protected List<String> _enum;
    protected Boolean exclusiveMaximum;
    protected Double maximum;
    protected Boolean exclusiveMinimum;
    protected Double minimum;

    protected Integer minLength;
    protected Integer maxLength;
    protected String  pattern;

    @JsonProperty("default")
    protected String defaultValue;

    public T property(Property property) {
        this.setProperty(property);
        return castThis();
    }

    public T type(String type) {
        this.setType(type);
        return castThis();
    }

    public T format(String format) {
        this.setFormat(format);
        return castThis();
    }

    public T description(String description) {
        this.setDescription(description);
        return castThis();
    }

    public T name(String name) {
        this.setName(name);
        return castThis();
    }

    public T required(boolean required) {
        this.setRequired(required);
        return castThis();
    }

    public T collectionFormat(String collectionFormat) {
        this.setCollectionFormat(collectionFormat);
        return castThis();
    }

    public T items(Property items) {
        this.items = items;
        return castThis();
    }

    public T _enum(List<String> value) {
        this._enum = value;
        return castThis();
    }

    public List<String> getEnum() {
        return _enum;
    }

    public void setEnum(List<String> _enum) {
        this._enum = _enum;
    }

    public Property getItems() {
        return items;
    }

    public void setItems(Property items) {
        this.items = items;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCollectionFormat() {
        return collectionFormat;
    }

    public void setCollectionFormat(String collectionFormat) {
        this.collectionFormat = collectionFormat;
    }

    public void setProperty(Property property) {
        this.type = property.getType();
        this.format = property.getFormat();
        if (property instanceof StringProperty) {
            final StringProperty string = (StringProperty) property;
            setEnum(string.getEnum());
        } else if (property instanceof ArrayProperty) {
            final ArrayProperty array = (ArrayProperty) property;
            setItems(array.getItems());
        }
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Boolean isExclusiveMaximum() {
        return exclusiveMaximum;
    }

    public void setExclusiveMaximum(Boolean exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
    }

    public Double getMaximum() {
        return maximum;
    }

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    public Boolean isExclusiveMinimum() {
        return exclusiveMinimum;
    }

    public void setExclusiveMinimum(Boolean exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
    }

    public Double getMinimum() {
        return minimum;
    }

    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public String getPattern() {
        return pattern;
    }

    @Override
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @JsonIgnore
    private T castThis() {
        @SuppressWarnings("unchecked")
        final T result = (T) this;
        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((_enum == null) ? 0 : _enum.hashCode());
        result = prime * result
                + ((collectionFormat == null) ? 0 : collectionFormat.hashCode());
        result = prime * result
                + ((defaultValue == null) ? 0 : defaultValue.hashCode());
        result = prime * result
                + ((exclusiveMaximum == null) ? 0 : exclusiveMaximum.hashCode());
        result = prime * result
                + ((exclusiveMinimum == null) ? 0 : exclusiveMinimum.hashCode());
        result = prime * result + ((format == null) ? 0 : format.hashCode());
        result = prime * result + ((items == null) ? 0 : items.hashCode());
        result = prime * result + ((maximum == null) ? 0 : maximum.hashCode());
        result = prime * result + ((minimum == null) ? 0 : minimum.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());

        result = prime * result + ((minLength == null) ? 0 : minLength.hashCode());
        result = prime * result + ((maxLength == null) ? 0 : maxLength.hashCode());
        result = prime * result + ((pattern == null) ? 0 : pattern.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AbstractSerializableParameter<?> other = (AbstractSerializableParameter<?>) obj;
        if (_enum == null) {
            if (other._enum != null) {
                return false;
            }
        } else if (!_enum.equals(other._enum)) {
            return false;
        }
        if (collectionFormat == null) {
            if (other.collectionFormat != null) {
                return false;
            }
        } else if (!collectionFormat.equals(other.collectionFormat)) {
            return false;
        }
        if (defaultValue == null) {
            if (other.defaultValue != null) {
                return false;
            }
        } else if (!defaultValue.equals(other.defaultValue)) {
            return false;
        }
        if (exclusiveMaximum == null) {
            if (other.exclusiveMaximum != null) {
                return false;
            }
        } else if (!exclusiveMaximum.equals(other.exclusiveMaximum)) {
            return false;
        }
        if (exclusiveMinimum == null) {
            if (other.exclusiveMinimum != null) {
                return false;
            }
        } else if (!exclusiveMinimum.equals(other.exclusiveMinimum)) {
            return false;
        }
        if (format == null) {
            if (other.format != null) {
                return false;
            }
        } else if (!format.equals(other.format)) {
            return false;
        }
        if (items == null) {
            if (other.items != null) {
                return false;
            }
        } else if (!items.equals(other.items)) {
            return false;
        }
        if (maximum == null) {
            if (other.maximum != null) {
                return false;
            }
        } else if (!maximum.equals(other.maximum)) {
            return false;
        }
        if (minimum == null) {
            if (other.minimum != null) {
                return false;
            }
        } else if (!minimum.equals(other.minimum)) {
            return false;
        }
        if (type == null) {
            if (other.type != null) {
                return false;
            }
        } else if (!type.equals(other.type)) {
            return false;
        }
        if (minLength == null) {
            if (other.minLength != null) {
                return false;
            }
        } else if (!minLength.equals(other.minLength)) {
            return false;
        }
        if (maxLength == null) {
            if (other.maxLength != null) {
                return false;
            }
        } else if (!maxLength.equals(other.maxLength)) {
            return false;
        }
        if (pattern == null) {
            if (other.pattern != null) {
                return false;
            }
        } else if (!pattern.equals(other.pattern)) {
            return false;
        }


        return true;
    }
}