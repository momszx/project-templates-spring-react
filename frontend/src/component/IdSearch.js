import React from 'react';
import Autosuggest from 'react-autosuggest';
const example = [
    {
        Name: "Joe Dao",
        ID:"442424"
    },
    {
        Name: "Joe Dao",
        ID:"6457"
    },
    {
        Name: "Joe Dao",
        ID:"797979"
    }
];
const getSuggestions = value => {
    const inputValue = value.trim().toLowerCase();
    const inputLength = inputValue.length;

    return inputLength === 0 ? [] : example.filter(id =>
        id.ID.toLowerCase().slice(0, inputLength) === inputValue
    );
};
const getSuggestionValue = suggestion => suggestion.name;

const renderSuggestion = suggestion => (
    <div>
        {suggestion.name}
    </div>
);

class IdSearch extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            value: '',
            suggestions: []
        };
    }
    onChange = (event, { newValue }) => {
        this.setState({
            value: newValue
        });
    };
    onSuggestionsFetchRequested = ({ value }) => {
        this.setState({
            suggestions: getSuggestions(value)
        });
    };
    onSuggestionsClearRequested = () => {
        this.setState({
            suggestions: []
        });
    };


    render() {
        const { value, suggestions } = this.state;
        const inputProps = {
            placeholder: 'Type a programming language',
            value,
            onChange: this.onChange
        };

        return (
            <Autosuggest
                suggestions={suggestions}
                onSuggestionsFetchRequested={this.onSuggestionsFetchRequested}
                onSuggestionsClearRequested={this.onSuggestionsClearRequested}
                getSuggestionValue={getSuggestionValue}
                renderSuggestion={renderSuggestion}
                inputProps={inputProps}
            />
        );
    }
}
export default IdSearch;

