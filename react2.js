import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals'

ReactDOM.render(
  <React.StrictMode>
    <App/>
    </React.StrictMode>
    document.getElementryById('root')
  );

import PropTypes from 'prop-types'
import Button from '.Button'

const Header=({title})=>{
  console.log('Click')
}
return(
  <header className='header'>
  <h1>{title}</h1>
  <Button color='green' text='Add'onClick=
  {onClick}/>
  </header>
)
}
return(
  <div classNmae='container'>
    <Header/>
    {
      tasks.length>0?(
        <Tasks tasks={tasks} onDelete=
        {deleteTasks} onToggel={toggleReminder}/
        >
      ) : (
        'No Tasks To Show '
      )}
      </div>
      )
    }
)
)
