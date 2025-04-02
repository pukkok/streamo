const SubmitButton = ({ isLoginPart=true, handleClick=null }) => {

  return (
    <button
    type="submit" onClick={handleClick} 
    className="
    bg-[#ffbb00]
    border border-[rgba(0,0,0,0.4)]
    rounded-[.3em]
    shadow-[inset_0_1px_0_rgba(255,255,255,0.3), inset_0_10px_10px_rgba(255,255,255,0.1)]
    text-[#873c00]
    text-[13px]
    font-bold
    cursor-pointer
    m-[15px_0] p-[5px_20px]
    w-full h-[40px]
    ">
      {isLoginPart ? "로그인" : "회원가입"}
    </button>
  )
}

export default SubmitButton