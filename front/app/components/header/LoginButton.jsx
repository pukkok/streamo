'use client'

const LoginButton = ({ onClick }) => (
  <button 
    onClick={onClick}
    className="text-sm bg-[#ffbb00] text-[#000] px-4 py-1 rounded-md hover:bg-[#e6a800] transition-all cursor-pointer"
  >
    로그인
  </button>
)

export default LoginButton
