'use client'

import Logo from './Logo'
import NavMenu from './NavMenu'
import SearchBar from './SearchBar'
import LoginButton from './LoginButton'

const Header = ({ onLoginClick }) => {

  return (
    <header className="flex items-center gap-12
    px-6 py-4 bg-[#111] shadow-md">
      <Logo />
      <NavMenu />
      <SearchBar />
      <div className="flex items-center gap-4 ml-auto">
        <LoginButton onClick={onLoginClick} />
      </div>
    </header>
  )
}

export default Header
