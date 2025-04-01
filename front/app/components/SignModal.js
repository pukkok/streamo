const SignModal = () => {
  return (
    <form className="
    bg-[#111111]
    border border-solid border-[#191919]
    rounded-[.4em]
    absolute
    top-0 bottom-0 right-0 left-0
    shadow-[0_5px_10px_5px_rgba(0,0,0,0.2)]
    m-auto
    overflow-hidden
    w-[300px] h-[280px]

    custom-gradient
    
    after:block
    after:w-[150px] after:h-[1px]
    after:absolute
    after:top-0 after:left-[50px]

    before:rounded-full
    before:shadow-[0_0_6px_4px_#fff]
    before:block
    before:w-[8px] before:h-[5px]
    before:absolute
    before:top-[-7px] before:left-[34%]
    ">
      <h1 className="
      font-[Audiowide] 
      border-b border-solid border-[#000]
      text-lg
      font-normal
      text-[#ffbb00]
      p-[15px_0]
      relative
      text-center
      text-shadow-[0_1px_0_#000]

      
      after:absolute
      after:block
      after:w-[250px]
      after:h-[180px]
      after:top-0
      after:ml-[138px]
      after:transform-flat
      after:skew-x-20
      light-bg
      ">
      Streamo
      </h1>

      <div className="
      border-t border-[#19191a] border-solid p-[20px]">
        <p>
          <input type='text'
          className="
          bg-gradient-to-r from-[#1f2124] to-[#27292c]
          border border-solid border-[#222]
          rounded-[.3em]
          shadow-[0_1px_0_rgba(255,255,255,0.1)]
          text-[#fff]
          text-[13px]
          mb-[20px]
          p-[8px_5px]
          w-full
          "
          />
        </p>
        <p>
        <input type='password'
          className="
          bg-gradient-to-r from-[#1f2124] to-[#27292c]
          border border-solid border-[#222]
          rounded-[.3em]
          shadow-[0_1px_0_rgba(255,255,255,0.1)]
          text-[#fff]
          text-[13px]
          mb-[20px]
          p-[8px_5px]
          w-full
          "
          />
        </p>
      </div>

      <button className="
      bg-[#ffbb00]
      border border-solid border-[rgba(0,0,0,0.4)]
      rounded-[.3em]
      shadow-[inset_0_1px_0_rgba(255,255,255,0.3)]
      text-[#873c00]
      cursor-pointer
      text-[13px]
      font-bold
      h-[40px]
      p-[5px_20px]
      w-full
      ">
        승인
      </button>
    </form>
  )
}

export default SignModal
